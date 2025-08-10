package Stack;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();

        int idx = 0;
        while (idx< str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result =  new StringBuilder();
        while (!s.empty()){
            char ch = s.pop();
            result.append(ch);

        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Om_Deshmukh"));
    }
}
