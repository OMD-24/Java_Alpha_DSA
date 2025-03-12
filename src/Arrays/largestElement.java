package Arrays;

import java.util.Scanner;

public class largestElement {
    public static int lar(int Arr[]) {
        int max = Arr[0];
        int min = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
            }
//            if (min < Arr[i]) {
//                min = Arr[i];
//            }


        }
        return max;
    }



    public static void main (String [] args){
        int Arr[] = new int[5];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<Arr.length; i++){
            Arr[i]=sc.nextInt();
        }

        System.out.println(lar(Arr));
    }
}
