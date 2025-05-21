package Contest_Ques_Practice;

import java.util.Scanner;

public class bestMovie {

    public static int min(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i=0; i< arr.length ; i++){
            if(arr[i]<min){
                 min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int A[] = new int [n];
            int B[] = new int [n];
            boolean y = false;

            for(int j=0; j<n ; j++){
                A[j] = sc.nextInt();
                B[j] = sc.nextInt();

                if(A[j]<7){
                    B[j] = Integer.MAX_VALUE;
                }
                else y = true;
            }

            if (y)
            System.out.println(min(B));

            else System.out.println(-1);


        }
    }
}
