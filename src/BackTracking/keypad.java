package BackTracking;

import java.util.Scanner;

public class keypad {
    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
            {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
            {'t','u','v'},{'w','x','y','z'}};

   public static void prints(String s, String ans , int i , int j){

       prints(s,ans+9,i+1,j+1);
   }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

    }
}
