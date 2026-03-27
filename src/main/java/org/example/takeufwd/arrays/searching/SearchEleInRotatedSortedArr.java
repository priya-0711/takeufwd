package org.example.takeufwd.arrays.searching;

public class SearchEleInRotatedSortedArr {
    public static void main(String[] args) {
        int nums[] = new int[]{1,0,1,1,1}, k = 0;
        System.out.println(searchEle(nums, k));
    }
    public static boolean searchEle(int[]nums,int k ) {
        int left=0,right = nums.length-1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(k==nums[mid]) return true;
            if(nums[left]<= nums[mid]) {
                if (k < nums[mid] && k >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (k > nums[mid] && k <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }
        return false;
    }
}
