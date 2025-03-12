package Arrays_2D;

public class digonalSum {

    public static int digonalSum(int arr[][]){
        int pd=0,sd=0;
        for (int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length;){
                if(i==j){
                    pd+=arr[i][j];
                }
                if (i+j==arr[i].length){
                    sd+=arr[i][j];
                }
            }
        }
       return pd+sd ;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};


        System.out.println("Diagonal Sum ="+ digonalSum(arr));
    }
}
