package org.example.takeufwd.arrays;

public class LowerBoundExample {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(lowerBound(nums, x));
    }
    public static int lowerBound (int[]nums , int x) {
        int index = -1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=x) {
               index = i;
               break;
            }
        }
        return index;
    }
}
