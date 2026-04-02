package org.example.takeufwd.revisionsecond;

import java.util.Arrays;

public class SortArrOfZeroOneTwo {
    public static void main(String[] args) {
        int nums [] = new int[] {0,1,2,1,0};
       // we need 0's on left 1's in mid and 2's in right -->[0,0,1,1,2]
        int left=0,mid=0,right=nums.length-1;
        while(mid<=right) {
            if (nums[mid]==0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        System.out.println(Arrays.toString(nums));


    }
}
