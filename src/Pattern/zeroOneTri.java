package Pattern;

import java.util.Scanner;

public class zeroOneTri {
    public static void Tri01(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
               if((i+j)%2==0){
                   System.out.print("1");
               }
               else {
                   System.out.print("0");
               }
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enTER n");
        int n = sc.nextInt();
        Tri01(n);
    }
}
