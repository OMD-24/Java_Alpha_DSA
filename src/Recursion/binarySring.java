package Recursion;

public class binarySring {
    public static void string(int n, String str, int lastPlace){
        if (n==0){
            System.out.println(str);
            return;
        }
        string(n-1,str+"0",0);
        if(lastPlace==0){
            string(n-1,str+"1",1);
        }
    }

    public static void main (String[] args){


        string(5,"",0);

    }
}
