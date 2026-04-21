package org.example.takeufwd.revisionsecond;

public class KadanesMaxSubArrSumCalc {
    public static void main(String[] args) {
        /*
        Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
        A subarray is a contiguous non-empty sequence of elements within an array.
        Input:
 nums = [2, 3, 5, -2, 7, -4]
Output:
 15
Explanation:
 The subarray from index 0 to index 4 has the largest sum = 15, which is the maximum sum of any contiguous subarray.
   */
        int[] nums = new int[] {-2, -3, -7, -2, -10, -4};
        int sum=0;int maxL=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            maxL = Math.max(maxL,sum);
        }
        System.out.println(maxL);
    }
}
