package Arrays;

public class trappedRainWater {

    public static void rainWater(int height[]){
        int n = height.length;

        //Calculate left max & right max boundary in th form of array
        int leftMax[] = new int [n];
        leftMax[0]=height[0];
        for (int i=1 ; i<n ; i++){
            leftMax[i] = Math.max(height[i],leftMax[i]);
        }

        int rightMax[] = new int [n];
        rightMax[n-1]= height[n-1];
        for (int i= (n-2); i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i]);
        }

        //
    }

    public static void main (String[] args){
        int height[]= {4,2,0,6,3,2,5};

    }
}
