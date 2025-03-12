package Sorting;

public class bubbleSorting {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

        public static void printArr(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }



    public static void main(String[] args){
        int arr[]= {5,4,1,3,2};
        printArr(arr);
        System.out.println();
        bubbleSort(arr);
       printArr(arr);


    }
}
