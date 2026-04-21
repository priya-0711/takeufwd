package org.example.takeufwd.revisionsecond;

public class MaxProductSubArr {
    public static void main(String[] args) {
        /*
        Given an array that contains both negative and positive integers, find the maximum product subarray.
        Input: Nums = [1,2,3,4,5,0]
        Output: 120
        Explanation: In the given array, 1×2×3×4×5 gives maximum product value.
         */
        int [] nums = {1,2,3,4,5,0}; int max=Integer.MIN_VALUE;
        // 2pointer approach
        int prefix =1,suffix=1;
        for(int i=0;i<nums.length;i++) {
            if(prefix==0) prefix =1;
            if(suffix==0) suffix =1;
            prefix = prefix* nums[i];
            suffix = suffix * nums[nums.length-i-1];
            max = Math.max(max, Math.max(prefix,suffix));
        }
        System.out.println(max);
    }
}
