package Stack;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int A[] = {6, 8, 0, 1, 3};
        Stack <Integer> s = new Stack<>();
        int nextG[]  = new int[A.length];

        for(int  i=A.length-1; i>=0; i--){

            while(!s.empty() && A[s.peek()] <= A[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextG[i] = -1;

            }

            else {
                nextG[i] = A[s.peek()];
            }
            s.push(i);
        }

        for (int x : nextG){
            System.out.print(x + " ");
        }
    }
}
