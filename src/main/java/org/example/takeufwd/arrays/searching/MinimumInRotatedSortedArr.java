package org.example.takeufwd.arrays.searching;

public class MinimumInRotatedSortedArr {
    public static void main(String[] args) {
        int arr[]= new int[] {4, 5, 6, 7, 0, 1, 2};
        // works fine with TC of o(n)

        /*int min = Integer.MAX_VALUE;
        int left=0,right = arr.length-1;
        while(left<=right) {
            if(arr[left]<arr[right]) {
                min = Math.min(min,arr[left]);
                left++;
            } else {
                min = Math.min(min,arr[right]);
                right--;
            }
        }
        System.out.println(min);*/

        int left=0,right = arr.length-1;
        int min;
        while(left<right) {
            int mid = (left + right) /2;
            if(arr[mid] > arr[right]) { //4
                left = mid+1; //3
            } else {
                right = mid;
            }
        }
        System.out.println(arr[left]);

    }
}
