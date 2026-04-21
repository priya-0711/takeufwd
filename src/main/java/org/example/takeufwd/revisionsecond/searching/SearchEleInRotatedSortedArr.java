package org.example.takeufwd.revisionsecond.searching;

public class SearchEleInRotatedSortedArr {
    public static void main(String[] args) {
        /*
        Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k.
        Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise,

         */
        int [] arr = {7, 8, 1, 2, 2 ,3, 3, 3, 4, 5, 6}; int k = 3 ;
        int left=0 , right = arr.length-1,mid=-1;
        while(left<=right) {
             mid = (left + right) /2;
            if(arr[mid] == k) {
                System.out.println(mid);
                break;
            }
            // to handle the duplicates
            if(arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++; right--;
                continue;
            }
            //check if left half is sorted
            if(arr[left]<=arr[mid]) {
                if(arr[left]<=k && k <arr[mid]) { //if k is between left and mid
                    right= mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //if right half is sorted
                if(k>=arr[mid] && k<=arr[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        if(mid == -1) {
            System.out.println(mid);
        }

    }
}
