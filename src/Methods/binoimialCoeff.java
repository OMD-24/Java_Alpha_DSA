package Methods;

import java.util.Scanner;

public class binoimialCoeff {
    public static int fact(int n){
        int factorial = 1;
        for(int i=n; i>0; i--){
            factorial *= i;
        }
        return factorial;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n");
        int n = sc.nextInt();
        System.out.println("Enter  r");
        int r = sc.nextInt();

        int ncr = (fact(n) /( fact(r) * fact(n-r) )) ;
        System.out.println(ncr);

    }
}
