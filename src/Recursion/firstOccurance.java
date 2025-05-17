package Recursion;

public class firstOccurance {
    public static int firstOccurance(int arr[] , int key, int i)
    {
        if (arr[i]==key){
            return i;
        }
        else if(i==arr.length){
            return  -1;
        }
        else return firstOccurance(arr, key, i+1);
    }

    public static void main (String[] args){
        int arr[] = {8,6,3,9,5,10,2,5,3};

        System.out.println(firstOccurance(arr,5,1));

    }
}
