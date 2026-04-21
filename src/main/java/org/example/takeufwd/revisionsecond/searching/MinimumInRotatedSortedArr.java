package org.example.takeufwd.revisionsecond.searching;

public class MinimumInRotatedSortedArr {
    public static void main(String[] args) {
        int arr [] = {3,1,2};
        int left=0 , right = arr.length-1;
        while(left<right) {
            int mid = left + (right - left)/2;
            if( arr[mid]>arr[right]) { //2>3
                //check on right side for min ele
                left = mid + 1; //left= 4
            } else {
                right = mid; //right=3
            }
        }
        System.out.println(arr[left]);
    }
}
