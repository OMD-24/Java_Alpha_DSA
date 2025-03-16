package Recursion;

import java.util.Scanner;

public class PrintNumbers {

    public static void printNo(int n){

        if(n==1){
            System.out.println("1");
        }

       else {
            System.out.print(n + " ");
            printNo(n - 1);
        }
    }

    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        printNo(n);

    }
}
