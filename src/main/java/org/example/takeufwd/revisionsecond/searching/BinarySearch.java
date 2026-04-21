package org.example.takeufwd.revisionsecond.searching;

public class BinarySearch {
    public static void main(String[] args) {

       /*You are given a sorted array of integers and a target, your task is to search for the target in the given array.
       Assume the given array does not contain any duplicate numbers.
        */
        int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 10; int res=-1;
        int left = 0,right=nums.length-1;
        while(left<=right) {
            int mid = (left + right) /2 ;
            if(nums[mid] == target) {
               res = mid;
                break;
            } else if(nums[mid]>target) {
                //search on left side
                // move right pointer to left
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println(res);
    }
}
