package Recursion;

import java.util.Scanner;

public class FibonacciNumber {

    // 0 1 1 2 3 5 8 13
    public static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        int fibon = fibo(n-1) + fibo(n-2);
        return fibon;
    }

    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        System.out.println(fibo(n));

    }
}
