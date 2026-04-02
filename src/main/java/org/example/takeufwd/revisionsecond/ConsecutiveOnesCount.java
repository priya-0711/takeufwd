package org.example.takeufwd.revisionsecond;

public class ConsecutiveOnesCount {
    public static void main(String[] args) {
        /*
        Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
         */
        int nums[] = new int [] {1,1,0,1,1,1};
       int count=0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                count++;
            } else {
                count=0;
            }
            maxCount = Math.max(maxCount,count);
        }
        System.out.println(maxCount);
    }
}
