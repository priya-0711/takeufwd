package org.example.takeufwd.revisionsecond.searching;

public class SearchElementInRotatedSortedArr {
    public static void main(String[] args) {
        /*
        Given an integer array nums, sorted in ascending order (with distinct values) and a target value k.
        The array is rotated at some pivot point that is unknown.
        Find the index at which k is present and if k is not present return -1
         */
        int nums[] = {4, 5, 6, 7, 0, 1, 2}, k = 0;
        int left = 0,right = nums.length-1; int mid=-1;
        while(left<=right) {
             mid = (left + right) / 2;
            if (nums[mid] == k) {
                System.out.println(mid);
                break;
            } else if (nums[left] <= nums[mid]) { //check if left is sorted
                if(nums[left]<=k && k< nums[mid]) { //search if k is present on left side between  left and mid
                    right = mid-1; //left side
                } else {
                    left = mid+1; //right side
                }
            } else {
                if(nums[mid]<k && k<=nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        if(mid == -1)
        System.out.println(mid);


    }
    }

