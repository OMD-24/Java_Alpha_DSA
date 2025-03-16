package Recursion;

import java.util.Scanner;

public class Sum {
    public static int sum(int n){
        if(n==1){

            return 1;
        }
        int S = n + sum(n-1);
        return S;
    }

    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        System.out.println(sum(n));

    }
}
