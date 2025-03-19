package Contest_Ques_Practice;

import java.util.Scanner;

public class LibraryProject {
    public static void main(String args []){
        // supose no. of books in a library are n
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        Member m = new Member();
        System.out.println("Which book do you want ?");
        String t = sc.nextLine();
        m.setTitle(t);
        System.out.println("If you want to bowrro book then type '1' if return type '2' ");
        int ip = sc.nextInt();
        if(ip==1){

        }



    }
}
class Library{
    String title;
    String author;
    int ISBN [] = new int[5];
    int n;

    void setTitle( String newtitle){
        title = newtitle;
     }

    }


class Member extends Library{
    String name;
    int MemberID [] = new int [3];

    public boolean borrowBook(int x){
        if (n==0){
            return false;
        }
        n--;
        return true;
    }

    public int returnBook(int n){

        n++;
        return n;

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
