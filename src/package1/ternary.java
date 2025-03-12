package package1;

import java.util.Scanner;

public class ternary {
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n= sc.nextInt();

    String type = ((n%2) ==0 ) ? "even": "odd";
    System.out.println(type);
}
}
