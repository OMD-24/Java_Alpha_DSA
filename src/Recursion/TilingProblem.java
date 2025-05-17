package Recursion;

public class TilingProblem {
    public static int tillingProblem(int n){

        //base case
        if (n==0 || n==1){
            return 1;
        }


        //kaam
        //verticle choice
        int fnm1 = tillingProblem(n-1);
         //horizontal choice
        int fnm2 = tillingProblem(n-2);

         int totalWays = fnm1 + fnm2 ;
         return totalWays;


    }

    public static void main (String[] args){
        int arr[] = {8,6,3,9,5,10,2,5,3};

        System.out.println(tillingProblem(3));

    }
}
