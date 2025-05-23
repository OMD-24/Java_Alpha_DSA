package BackTracking;

public class Permutations {

    public static void findPermutations(String str, String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++ ){

            char currChar = str.charAt(i);

            //"abcde" = "ab" + "de"

            String newStr = str.substring(0,i)+ str.substring(i+1);
            findPermutations(newStr,ans+currChar);
        }

    }


    public static void main(String args[]) {
        String str = "abc";
        findPermutations("abc","");
    }
}
