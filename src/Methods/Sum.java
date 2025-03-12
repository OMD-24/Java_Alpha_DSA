package Methods;

import java.util.Scanner;

public class Sum {
 static int Sum(int a, int b) {
     return a+b;
    }
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enTER X&Y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(Sum(x,y));

    }
}
