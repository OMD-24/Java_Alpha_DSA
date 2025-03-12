package Methods;

import java.util.Scanner;

public class isPrime {
   public static boolean isPrime(int n){
       boolean isPrime = true;
       for(int i=2; i<(n-1); i++){
           if ((n%i)==0){
               isPrime = false;
               break;
           }
       }
       return isPrime;
   }

   public static void main(String[] argd){
       System.out.println("Enter a Number");
       Scanner sc = new Scanner (System.in);
       int x= sc.nextInt();
       System.out.println(isPrime(x));
   }
}
