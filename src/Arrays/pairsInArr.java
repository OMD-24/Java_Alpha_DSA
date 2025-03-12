package Arrays;

public class pairsInArr {
    public static void pairs(int Arr[]){
        for(int i=0; i<Arr.length; i++){
            for(int j=i+1; j< Arr.length; j++){
                System.out.print("("+Arr[i]+","+ Arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int Arr[] = {2,4,6,8,10};

        pairs(Arr);
    }
}
