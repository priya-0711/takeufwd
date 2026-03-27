package org.example.takeufwd.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrWithZeroSum {
    public static void main(String[] args) {
        int arr[] = new int[]{9, -3, 3, -1, 6, -5};
        int k = 0;
        longestSubArrWith0Sum(arr,k) ;
    }
    public static void longestSubArrWith0Sum(int[]arr, int k ){
        int  sum =0; int maxL=0;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
            if(sum ==k)  {
                maxL = i+1;
            } else {
                if (!hmap.containsKey(sum)) {
                    hmap.put(sum, i);
                } else {
                    maxL = Math.max(maxL, i - hmap.get(sum));
                }
            }
        }
        System.out.println(maxL);
    }
}
