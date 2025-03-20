package Contest_Ques_Practice;

import java.util.Scanner;

public class que {
    public static void main(String [] args){
        int T,n,k;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int t =0; t<T; t++){
            n= sc.nextInt();
            k=sc.nextInt();

            int A[] = new int[n];
            for(int m=0; m<n; m++){
                A[m]= m+1;
            }
            int P[] = new int[n];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A.length; j++){
                    if(A[j] != (i+1) && (A[j] % k) == ((i+1)% k)){
                        P[i]=A[j];

                    }
                }
            }

            int cnt =0;
            for (int i=0;i< A.length;i++)
            {
                if (P[i]!=0)
                {
                    cnt++;
                }
                else{
                    System.out.println(-1);
                    break;
                }
            }
            if (cnt==A.length)
            {
                for (int i=0;i<A.length;i++)
                {
                    System.out.print(P[i]+" ");
                }
            }

        }
        System.out.println("");
    }
}
