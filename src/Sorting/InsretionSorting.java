package Sorting;

public class InsretionSorting {


    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            //Finding out current position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1]=curr;
        }


    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        printArr(arr);
        System.out.println();
        insertionSort(arr);
        printArr(arr);
    }
}
