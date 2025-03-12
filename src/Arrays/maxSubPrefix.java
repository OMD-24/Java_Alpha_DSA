package Arrays;

public class maxSubPrefix {

    public static void maxSubArr(int[] Arr) {
        int curr =0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[] = new int [Arr.length];

        prefix[0]=Arr[0];
        for(int i=1; i< Arr.length; i++){
            prefix[i]= prefix[i-1] + Arr[i];
        }

        for (int i = 0; i < Arr.length; i++) {
            int start = i;
            for (int j = 0; j < Arr.length; j++) {
                int end =j;
                curr= start==0 ? prefix[end] : prefix[end]-prefix[start-1]  ;

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
