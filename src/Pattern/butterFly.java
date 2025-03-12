package Pattern;

import java.util.Scanner;

public class butterFly {
    public static void bf(int n){
        for(int i=1; i<=(n/2); i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            for (int j=1+i; j<=(n/2); j++){
                System.out.print("_");
            }

            for (int j=(n/2)+1; j<=(n-i); j++){
                System.out.print("_");
            }

            for (int j=(n-i+1); j<=n; j++){
                System.out.print("*");
            }

//            for (int j=1; j<=(n-i+1); j++){
//                System.out.print("*");
//            }
//
//            for (int j=i; j<=n; j++){
//                System.out.print("*");
//            }

            System.out.println();
        }

        for(int i=(n/2)+1; i<=n; i++){
            for (int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }

            for (int j=(n-i+2); j<=(n/2); j++){
                System.out.print("_");
            }

            for (int j=(n/2)+1; j<=(i-1); j++){
                System.out.print("_");
            }

            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enTER n");
        int n = sc.nextInt();
        bf(n);
    }
}
