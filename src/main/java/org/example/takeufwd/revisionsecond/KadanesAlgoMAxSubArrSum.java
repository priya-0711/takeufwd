package org.example.takeufwd.revisionsecond;

public class KadanesAlgoMAxSubArrSum {
    public static void main(String[] args) {
        /*
        Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
        A subarray is a contiguous non-empty sequence of elements within an array.
         nums = [2, 3, 5, -2, 7, -4]
         Output: 15
         Explanation:
         The subarray from index 0 to index 4 has the largest sum = 15, which is the maximum sum of any contiguous subarray.
         */

        int nums[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;int maxL=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            maxL = Math.max(sum,maxL);
            if(sum<0) sum =0;

        }
        System.out.println(maxL);

    }
}
