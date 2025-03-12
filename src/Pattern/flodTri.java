package Pattern;

import java.util.Scanner;

public class flodTri {
    public static void flod(int n){
        int m=1;
        for(int i=0; i<n; i++){
            for (int j=0; j<=(i); j++){
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enTER n");
        int n = sc.nextInt();
        flod(n);
    }
}
