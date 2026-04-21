package org.example.takeufwd.revisionsecond.searching;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        /*
        Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key. If the target is not found then return -1.
        Note: Consider 0 based indexing

         */
        int target = 13, arr[] = {3, 4, 13, 13, 13, 20, 40};
        int left = 0,right =  arr.length-1;
        int first=-1;int second=-1;
        //first occurence
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                //search left side
                 first = mid;
                 right= mid-1;
            } else if( arr[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println(first);

        //last occurence
        left = 0; right =  arr.length-1;
        while(left <= right) {
            int mid = left + (right -left ) / 2;
            if(arr[mid] == target) {
                //search right side
                second = mid;
                left= mid+1;
            } else if( arr[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println(second);
    }
}
