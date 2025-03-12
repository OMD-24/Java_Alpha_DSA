package package1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        for (int i=2; i<(n/2); i++) {
            if (n%i==0){
                System.out.println("Not Prime");
                break;
            }


                System.out.println("Prime");



        }
    }

}
