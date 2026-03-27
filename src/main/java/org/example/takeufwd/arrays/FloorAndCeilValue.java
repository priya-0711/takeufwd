package org.example.takeufwd.arrays;

public class FloorAndCeilValue {
    public static void main(String[] args) {
        int arr [] = new int[] {3,4,4,7,8,10};
        int x = 5;
        System.out.println(findFloor(arr,x));
        System.out.println(findCeil(arr,x));
    }
    public static int findFloor(int[]arr,int x) {
        int left=0, right=arr.length-1;
        int ans =-1;
        while(left <= right) {
            int mid = (left+right) /2;
            if(arr[mid]<=x) {
                ans = arr[mid];
                left = mid +1;
            } else {
                right = mid- 1;
            }
        }
        return ans;
    }

    public static int findCeil(int[]arr,int x) {
        int left=0, right=arr.length-1; int ans=-1;
        while(left <= right) {
            int mid = (left+right) /2;
            if(arr[mid]>=x) {
                ans = arr[mid];
                right = mid-1;
            } else {
                left = mid+1;
            }

        }
        return ans;
    }
}
