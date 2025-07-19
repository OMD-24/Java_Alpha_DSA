package Arrays;

import java.util.Scanner;

public class binarySearch {

    public static int  binarysearch(int Arr[], int key){
        int start =0;
        int end = (Arr.length)-1;
        while(start<=end){
            int mid = (start+end)/2;

            if (Arr[mid]==key){
                return mid;
            }

            if (Arr[mid]<key){
                start = mid+1;
            }
            if (Arr[mid]>key){
                start = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int Arr[] = {2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index for key is : "+ binarysearch(Arr,key));
    }
}
