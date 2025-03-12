package package1;

public class reverseNumber {
    public static void main(String[] args){
        int n=10899
                ;
        int reverse =0;
        int lastDigit;


        while(n>0){
            lastDigit =  n%10;
            n = n/10 ;


                reverse =(10* reverse) + ( lastDigit);



        }

        System.out.println(reverse);
    }
}
