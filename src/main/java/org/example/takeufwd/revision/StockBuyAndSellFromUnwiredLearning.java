package org.example.takeufwd.revision;

public class StockBuyAndSellFromUnwiredLearning {
    public static void main(String[] args) {
        int arr[] =new int[]  {7,1,5,3,6,4,0};
        int min = arr[0]; int max = Integer.MIN_VALUE;
        for(int i=1 ; i < arr.length ; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i] - min);
        }
        System.out.println(max);
    }
}
