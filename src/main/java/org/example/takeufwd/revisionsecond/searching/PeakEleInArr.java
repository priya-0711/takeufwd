package org.example.takeufwd.revisionsecond.searching;

public class PeakEleInArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,5,1};
        int left =0,right = arr.length-1;
        while(left<right) {
            int mid = (left + right) / 2;
            if(arr[mid-1]<arr[mid]) {
                left = mid +1;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
    }
}
