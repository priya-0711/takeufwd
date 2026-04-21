package org.example.takeufwd.revisionsecond;

public class MaxConsecutiveOnesWithAtmostGivenK {
    public static void main(String[] args) {
        /*
        Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

        Input : nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] , k = 3
        Output : 10
        Explanation : The maximum number of consecutive 1's are obtained only if we flip the 0's present at position 3, 4, 5 (0 base indexing).
        The array after flipping becomes [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0].
        The number of consecutive 1's is 10.
         */
        int[] nums = new int[] {0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 3;
        //sliding window
        //1.expand the window
        //2.shrink the window
        //3.update the maxlen
        int left=0, maxLen=0,  zeroCount=0;
        for(int right=0;right<nums.length;right++) {
            //expansion
            if(nums[right]==0) {
                zeroCount++; //4
            }
            //shrink
            if(zeroCount>k) {
                if(nums[left] ==0) {
                    zeroCount--;
                }
                left++;
            }
            //update maxlen
            maxLen= Math.max(maxLen,right-left+1); //5
        }
        System.out.println(maxLen);


    }
}
