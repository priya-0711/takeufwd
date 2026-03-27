package org.example.takeufwd.arrays.searching;

/*
*Problem Statement: Given an array of length N, peak element is defined as the element greater than both of its neighbors. Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].
* Find the index(0-based) of a peak element in the array.
* If there are multiple peak numbers, return the index of any peak number.
*
* */
public class PeakElementSearch {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7,8,5,1};
        int left =0 ; int right = arr.length-1;
        while(left<right) {
            int mid = (left+right)/2;
            if(arr[mid]>arr[mid+1]) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        System.out.println(left);
    }
}
