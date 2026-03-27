package org.example.takeufwd.arrays;

public class SecondLArgeElement {
    public static void main(String[] args) {
        int[] arr = new int[]{8,8,8,8,8};
        System.out.println(secondLargeElement(arr));
    }
    public static int secondLargeElement(int[] arr) {
        int max1= Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        if(arr == null || arr.length==1) return -1;

        for(int i=0;i<=arr.length-1;i++) {
            if(max1<arr[i]) {
                max1 = arr[i];
            } else if(max2<arr[i] && max1!=arr[i]){
                max2 = arr[i];
            }
        }
        return (max2==Integer.MIN_VALUE ?-1 : max2);
    }
}
