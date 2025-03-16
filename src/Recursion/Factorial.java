package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        if(n==0){

            return 1;
        }
       int factn = n * fact(n-1);
        return factn;
    }

    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        System.out.println(fact(n));

    }
}
