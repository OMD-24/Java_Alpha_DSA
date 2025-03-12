package Arrays;

public class subArr {

    public static void sub(int[] Arr) {

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(Arr[k] + " ");

                }

                System.out.println();
            }
            System.out.println();

        }


    }


    public static void main(String[] args) {
        int Arr[] = {2, 4, 6, 8, 10};
        sub(Arr);

    }
}