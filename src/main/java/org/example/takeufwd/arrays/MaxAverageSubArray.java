package org.example.takeufwd.arrays;

import static java.lang.Math.max;

public class MaxAverageSubArray {
    public static void main(String[] args) {
        int nums[] = new int[] {1,12,-5,-6,50,3};
        int k = 4; int sum=0,maxSum;
        for(int i=0;i<k;i++) {
            sum = sum + nums[i];
        }
        maxSum = sum;
        //sliding window
        int start =0,end = k;
        while(end < nums.length) {
            sum = sum -nums[start];
            start++;
            sum = sum +nums[end];
            end++;
            maxSum = max(sum,maxSum);
        }
        System.out.println(maxSum/k);
    }
}
