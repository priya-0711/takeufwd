package org.example.takeufwd.revisionsecond;

import java.util.Arrays;

public class TwoSumWith2Pointers {
    public static void main(String[] args) {
        int [] nums = new int [] {-7,-3,1,3,5,6}; int target=0;
        int[] output = new int[]{-1,-1};
        int left =0; int right = nums.length-1;
        while(left <= right) {
            if(nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                output[0] = left;
                output[1] = right;
                break;
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
