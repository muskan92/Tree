package neetcode;

public class RainWaterTrap {

    public static int trap(int[] height) {

        int n = height.length;
        int [] pref = new int[n];
        int [] suff = new int[n];
        int max = 0;

        for(int i=0; i<n; i++){

            if(height[i] > max){
                max = height[i];
            }
            pref[i] = max;

        }
        max = 0;
        for(int i=n-1; i>=0; i--){

            if(height[i] > max){
                max = height[i];
            }
            suff[i] = max;

        }
        max = 0;
        for(int i=0; i<n; i++){
            max = max+ (Math.min(pref[i],suff[i]) - height[i]);
        }

        return max;

    }

    public static void main(String[] args) {
        System.out.println(trap(new int []{0,2,0,3,1,0,1,3,2,1}));
    }
}
