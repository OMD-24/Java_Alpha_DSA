package Pattern;

import java.util.Scanner;

public class halfPyramidNum {
    public static void numPy(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<(n-i); j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enTER n");
        int n = sc.nextInt();
        numPy(n);
    }
}
