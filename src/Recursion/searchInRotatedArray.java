package Recursion;

public class searchInRotatedArray {
    public static int search(int arr[] , int tar, int si, int ei) {
        // base case

        if (si > ei) {
            return -1;

        }

        //kaam
        int mid = si + (ei - si) / 2;

        //case found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on l1
        if (arr[si] <= arr[mid]) {
            //left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);

            } else //right
            {
                return search(arr, tar, mid + 1, ei);
            }
        }

        // mid on l2
        else {
            // right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else // left
            {
                return search(arr, tar, si, mid - 1);
            }
        }


    }


    public static void main(String[] args){
        int Arr[] = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(search(Arr,0,0,6));
    }
}
