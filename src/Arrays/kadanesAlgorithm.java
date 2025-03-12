package Arrays;

public class kadanesAlgorithm {
    public static void kadanes(int Arr[]) {

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < Arr.length;i++){
            cs = cs + Arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum is :"+ ms);
    }

    public static void main(String[] args) {
        int Arr[] = {1, -2, 6, -1, 3};
        kadanes(Arr);

    }
}
