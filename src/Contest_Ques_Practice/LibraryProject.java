package Contest_Ques_Practice;

import java.util.Scanner;

public class LibraryProject {
    public static void main(String args []){
        // supose no. of books in a library are n
//        int n;
        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
        Library l = new Library();
        Member m = new Member();

        System.out.println("Write your name ?");
        String e = sc.nextLine();
        m.setMemberName(e);

        System.out.println("Write your ID ?");
        int r = sc.nextInt();
        m.setMemberID(r);

        System.out.println("Which book do you want");
        String y= sc.nextLine();
        l.setTitle(y);

        System.out.println("Write a Author name book do you want ?");
        String w = sc.nextLine();
        l.setAuthor(w);

        System.out.println("Write a Number of book do you want ?");
        int q = sc.nextInt();
        l.setBookNo(q);



        System.out.println("If you want to bowrro book then type '1' if return type '2' ");
        int ip = sc.nextInt();
        System.out.println("How many books you want to bowrro  or return aslo type quantity ");
        int qt = sc.nextInt();
        if(ip==1){
            m.borrowBook(qt);
            System.out.println("You have borrowed "+ qt + " books "+"of name "+ y+ " written by "+ w);
        }

        if(ip==2){
            m.returnBook(qt);
            System.out.println("You have returnrd "+ qt + " books "+"of name "+ y+ " written by "+ w);
        }



    }
}
class Library{
   private String title;
   private String name;
    int bookNo ;
    int n=5;

    String getTitle(){
        return title;
    }

    void setTitle( String newtitle){
        title = newtitle;
     }

    String getAuthor(){
        return name;
    }

    void setAuthor( String authorName){
        name = authorName;
    }

    int getBookNo(){
        return bookNo;
    }
    void setBookNo(int bookID){
        bookNo = bookID;
    }



    }


class Member extends Library{
    private String MemberName;
    private int MemberID ;

    String getMemberName(){
        return MemberName;
    }
    void setMemberName(String yourName){
        MemberName=yourName;
    }
    int getMemberID(){
        return MemberID;
    }
    void setMemberID(int yourID){
        MemberID = yourID;
    }

    public String borrowBook(int x){
        if (n>=x){
            return "Book is not Avaiable";
        }
        n=n-x;
        return "Book is Avaiable";
    }

    public int returnBook(int x){

        n=n+x;
        return n;

    }

   protected void protectedRecord(String MemberName, int id) {

       String names = "";
//           names+= MemberName;
       int Arr[] = new int[10];
       for (int i = 0; i < 10; i++) {
           Arr[i] = id;
           names += i + MemberName;
       }


   }



}



/*

Question:
You are designing a library management system in Java or C++. The system should have the following requirements:

1. There are Books with attributes like title, author, and ISBN.


2. A LibraryMember can borrow books. Each member has a name and a memberID.


3. The system should allow checking out and returning books.


4. Ensure proper OOP principles are followed (e.g., encapsulation, inheritance, polymorphism).



Task:

Design the class structure using inheritance and encapsulation.

Implement a function borrowBook(Book book) in LibraryMember that checks if the book is available and allows borrowing.

Implement a function returnBook(Book book) that marks the book as returned.


Can you write the class structure and methods for this?
 */

/*

this is code by chatGPT
package Contest_Ques_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Library
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "1234"));
        library.addBook(new Book("Lord of the Rings", "J.R.R. Tolkien", "5678"));
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "91011"));

        // Create a member
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your Member ID:");
        int id = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        LibraryMember member = new LibraryMember(name, id);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.println("Enter book title to borrow:");
                String title = sc.nextLine();
                member.borrowBook(library, title);
            } else if (choice == 2) {
                System.out.println("Enter book title to return:");
                String title = sc.nextLine();
                member.returnBook(library, title);
            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

// Book Class (Encapsulation)
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Initially available
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }
}

// Library Class (Manages Books)
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                return book;
            }
        }
        return null;
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Error: Book not found or already available.");
    }
}

// LibraryMember Class (Encapsulation & Composition)
class LibraryMember {
    private String name;
    private int memberID;

    public LibraryMember(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public void borrowBook(Library library, String title) {
        Book book = library.findBook(title);
        if (book != null) {
            book.borrow();
            System.out.println(name + " borrowed " + title);
        } else {
            System.out.println("Sorry, book is not available.");
        }
    }

    public void returnBook(Library library, String title) {
        library.returnBook(title);
    }
}


This is an OUTPUT of chatgpt code

Enter your name:
Alice
Enter your Member ID:
101

Menu:
1. Borrow a book
2. Return a book
3. Exit
Enter your choice: 1
Enter book title to borrow:
Harry Potter
Alice borrowed Harry Potter

Menu:
1. Borrow a book
2. Return a book
3. Exit
Enter your choice: 2
Enter book title to return:
Harry Potter
Book returned successfully!

Menu:
1. Borrow a book
2. Return a book
3. Exit
Enter your choice: 3
Exiting program...


*/