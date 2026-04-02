package org.example.takeufwd.revisionsecond;

public class TrappingRainWater {
    public static void main(String[] args) {
        /*
        Given an array of non-negative integers representation elevation of ground. Your task is to find the water that can be trapped after rain .
        Input : height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output : 6
Explanation : Water is trapped in the dips between bars. The total trapped water units add up to 6 (1+1+2+1+1).
         */
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        int i =0 , j = height.length-1, left =0 , right=0 ,water=0;
        while(i<j) {
            if(height[i]<height[j]) {
                if(left>height[i]) {
                    water = water + left - height[i];
                } else {
                    left = Math.max(left, height[i]);
                }
                i++;
            } else if(height[i]>=height[j]) {
                if(right>height[j]) {
                    water = water+right-height[j];
                } else {
                    right = Math.max(right, height[j]);
                }
                j--;
            }
        }
        System.out.println(water);

    }
}
