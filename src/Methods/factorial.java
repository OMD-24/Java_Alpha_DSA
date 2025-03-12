package Methods;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int factorial = 1;
        for(int i=n; i>0; i--){
            factorial *= i;
        }
        return factorial;
    }

    public static void main (String [] args){
        System.out.println("Enter a Number");
        Scanner sc = new Scanner (System.in);
        int x= sc.nextInt();
        int f= fact(x);
        System.out.println("Factorial of the sum is "+f);


    }
}
