package Recursion;

public class FriendsPairing {
    public static int pairing(int n){
        //choice
        //Single

        if (n==1 || n==2){
            return n;
        }
        int fnm1 = pairing(n-1);


        //pair
        int fnm2 = pairing(n-2);

        int pairs = (n-1)*fnm2;

        //total ways
        int totalWays = fnm1 + pairs;
        return totalWays;
    }

    public static void main (String[] args){


        System.out.println(pairing(3));

    }
}
