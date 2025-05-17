package Recursion;

public class lastOccurance {
    public static int lastOccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = lastOccurance(arr, key, i+1);
        if (isfound == -1 && arr[i]==key){
            return i;
        }


        return isfound;
    }

    public static void main (String[] args){
        int arr[] = {8,6,3,9,5,10,2,5,3};

        System.out.println(lastOccurance(arr,5,1));

    }
}
