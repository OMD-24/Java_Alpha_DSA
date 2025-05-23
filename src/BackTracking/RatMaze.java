package BackTracking;

import java.util.Scanner;

public class RatMaze {
    public static void findWays(char [][]A, int i, int j,boolean [][] B) {

        if (i== A.length || j== A.length || i== -1 || j== -1  || A[i][j] ==0){
            return;
        }


       check(B,i,j);


        if (i== A.length-1 && j== A.length-1){
            convert(A,B);
            print(A);

        }


        int l = A.length;


        //up
        if(i != 0 && !B[i - 1][j]){
            findWays(A, i - 1, j,B);
        }

        //Down
        if(i+1 != l && !B[i+1][j]){
            findWays(A, i + 1, j,B);
        }

        //Right
        if(j+1 != l && !B[i][j+1]){
            findWays(A, i, j + 1,B);
        }

        //Left
        if(j != 0 && !B[i ][j-1]){
            findWays(A, i, j - 1,B);
        }




    }

    public static void convert(char [][]A, boolean [][]B){

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {

                if(!B[i][j]){
                    A[i][j] = 0;
                }

            }

        }

    }



    public static void check(boolean [][]B, int m,int n){
        B[m][n] = true;

    }




    public static void print(char [][]A){
        System.out.println("-------------MAZE-------------");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();

        }


        System.out.println("...............................");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char maze[][] = {
                { 'x', '0', 'x', '0', 'x' },
                { 'x', 'x', 'x', '0', 'x' },
                { '0', '0', 'x', '0', 'x' },
                { 'x', 'x', 'x', 'x', 'x' },
                { '0', '0', '0', '0', 'x' }
        };



        int t = maze.length;


        boolean[][] B = new boolean[t][t];

        findWays(maze,0,0,B);
    }
}


/*
*
 int maze[][] = {
    { 1, 0, 1, 1, 1 },
    { 1, 1, 1, 0, 1 },
    { 0, 0, 1, 0, 1 },
    { 1, 1, 1, 1, 1 },
    { 0, 0, 0, 0, 1 }
};
*  */