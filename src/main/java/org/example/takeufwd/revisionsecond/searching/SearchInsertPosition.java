package org.example.takeufwd.revisionsecond.searching;

public class SearchInsertPosition {
    public static void main(String[] args) {
        /*
        Given a sorted array of distinct integers and a target value, return the index if the target is found.
        If not, return the index where it would be if it were inserted in order.
        Input: nums = [1,3,5,6], target = 2
        Output: 1
        */
        int[] nums = {1,3,5,6};
        int left=0,right= nums.length-1,target=0,res=0;
        while(left<=right) {
            int mid = (left + right) / 2;
            if(target==nums[mid]) {
                res=mid;
                break;
            } else if(target>nums[mid]) {
                //right side search
                left = mid+1;
               res=left;
            } else if(target<nums[mid]){
                right= mid-1;
            }
        }
        System.out.println(res);

    }
}
