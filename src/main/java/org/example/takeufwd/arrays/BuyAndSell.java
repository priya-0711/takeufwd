package org.example.takeufwd.arrays;

public class BuyAndSell {
    public static void main(String[] args) {
        int arr[]= new int [] {10, 7, 8, 11, 9,5};
        System.out.println(buyAndSell(arr));
    }
    public static int buyAndSell(int[]arr) {
        int max=0; int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            min = Math.min(min,arr[i]);
           max = Math.max(max,arr[i]-min);
        }

        return max;

    }
}
