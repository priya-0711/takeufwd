package org.example.takeufwd.revisionsecond;

public class LongestSubarrayWithGivenSumK {
    public static void main(String[] args) {
        /*
         Given an array nums of size n and an integer k,
         find the length of the longest sub-array that sums to k.
          If no such sub-array exists, return 0.
         Example 1:
         Input: nums = [10, 5, 2, 7, 1, 9], k = 15
         Output: 4
         Explanation: The longest sub-array with a sum equal to 15 is [5, 2, 7, 1],
         which has a length of 4. This sub-array starts at index 1 and ends at index 4,
         and the sum of its elements (5 + 2 + 7 + 1) equals 15.
          Therefore, the length of this sub-array is 4. */
        int k=15 , arr[] = new int[]{10, 5, 2, 7, 1, 9};
        int sum=0,left=0,right=0,maxL=0;
        while(left <= right && right < arr.length) {

            if(sum<=k) {
                sum = sum + arr[right];
            }
            while(sum>k) {
                sum = sum- arr[left];
                left++;
            }
            if(sum==k) {
                maxL = Math.max(maxL,right-left+1);
            }
            right++;

        }
        System.out.println(maxL);

    }
}
