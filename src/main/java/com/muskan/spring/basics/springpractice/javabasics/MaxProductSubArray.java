package com.muskan.spring.basics.springpractice.javabasics;

public class MaxProductSubArray {

    public static void main(String[] args) {
        int ar [] = new int[]{ 1, -2, -3, 0, 7, -8, -2 }; //112
        //{-2, -40, 0, -2, -3}; //80
        // {-1, -3, -10, 0, 60}; //60
        // {6, -3, -10, 0, 2}; //180
        int maxProduct = findMaxProduct(ar);
        System.out.println(maxProduct);
    }

    private static int findMaxProduct(int[] nums) {
        int currentMaxP=nums[0];
        int currentMinP=nums[0];
        int previousMaxP=nums[0];
        int previousMinP=nums[0];
        int ans=nums[0];   //Stores the answer to be returned

        for(int i=1;i<nums.length;i++){

            currentMaxP=Math.max(Math.max(previousMaxP*nums[i],previousMinP*nums[i]),nums[i]);
            currentMinP=Math.min(Math.min(previousMaxP*nums[i],previousMinP*nums[i]),nums[i]);
            ans=Math.max(ans,currentMaxP);
            previousMaxP = currentMaxP;
            previousMinP = currentMinP;

        }
        return ans;
    }
}
