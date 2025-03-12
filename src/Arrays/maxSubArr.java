package Arrays;

public class maxSubArr {


    public static void maxSubArr(int[] Arr) {
        int curr =0;
        int maxSum= Integer.MIN_VALUE;

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                curr=0;
                for (int k = i; k <= j; k++) {
                    curr+=Arr[k];
                }
//                System.out.println(curr);
                if(curr>maxSum){
                    maxSum=curr;
                }
            }


        }
        System.out.println("max Sum is"+maxSum);



    }


    public static void main(String[] args) {
        int Arr[] = {1, -2, 6, -1, 3};
        maxSubArr(Arr);

    }
    }


