package Pattern;

import java.util.Scanner;

public class hollowRectangle {
    public static void holrect(int tr,int tc){
        for(int i=0; i<tr; i++){
            for(int j=0; j<tc; j++){
                if(i==0 || j==0 || i==(tr-1) || j==(tc-1) ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enTER row & column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        holrect(row,column);
    }
}
