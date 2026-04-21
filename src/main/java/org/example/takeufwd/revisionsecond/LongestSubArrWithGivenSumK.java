package org.example.takeufwd.revisionsecond;

public class LongestSubArrWithGivenSumK {
    public static void main(String[] args) {
        /*
        Given an array nums of size n and an integer k,
        find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
        Input:
 nums = [10, 5, 2, 7, 1, 9], k = 15
Output: 4
Explanation:
 The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4.
 This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15.
 Therefore, the length of this sub-array is 4.
         */
        int nums[] = new int [] {10, 5, 2, 7, 1, 9};
        int k = 15; int sum =0;
        int left=0,right=0;
        int maxLen=0;
        while(right<nums.length) {
            sum = sum + nums[right];
            while(sum>k) {
                sum = sum - nums[left];
                left++;
            }
            if(sum==k) {
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
        }
        System.out.println(maxLen);

    }
}
