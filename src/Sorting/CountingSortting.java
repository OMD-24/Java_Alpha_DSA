package Sorting;

public class CountingSortting {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i=0; i<count.length; i++){
            arr[j]=i;
            j++;
            count[i]--;
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
        countingSort(arr);
        printArr(arr);
    }
}
