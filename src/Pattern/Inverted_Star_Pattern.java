package Pattern;

public class Inverted_Star_Pattern {
    public static void main(String[] args){
        int column=4;
        for (int i=1; i<=4; i++){
            for (int j=1; j<=column; j++){
                System.out.print("*");
            }
            System.out.println("");
            column--;
        }
    }
}
