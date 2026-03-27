package org.example.takeufwd.revision;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int arr[] =new int[]  {7,1,5,3,6,4};
        int maxP = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i<arr.length; i++) {
           min = Math.min(min, arr[i]);
           maxP = Math.max(maxP, arr[i]-min);

        }
        System.out.println(maxP);


    }
}
