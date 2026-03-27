package org.example.takeufwd.arrays.searching;

public class BinarySearchInSortedArray {
    public static void main(String[] args) {
        int [] nums = new int[]{-1,0,3,5,9,12};
        int target = 2;
        int low= 0, high = nums.length-1;
        while(low<=high) {
            int mid = (low +high) /2 ;
            if(target<nums[mid]) {  //left
                high = mid-1;
            } else if(target > nums[mid]) {  //right
                low =mid +1;
            } else if(target  == nums[mid]) {
                System.out.println(mid);
                break;
            }
        }
        System.out.println(-1);
    }
}
