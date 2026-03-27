package org.example.takeufwd.arrays;

import java.util.Arrays;

public class SortArrofZeroOneTwo {
    public static void main(String[] args) {
        int [] nums = new int[] {2,0,1};
        sortArr(nums);
    }
    public static void sortArr(int[]nums) {
        int low=0,mid=0;int high=nums.length-1;
        while(mid<=high) {
            if(nums[mid]==2) {
                //swap nums[low] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            if( nums[mid]==1) {
                mid++;
            } else {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;low++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
