package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr = new int[] {1, 3, 5, -7, 6, -3};
        int target = 0;
        twoSum(arr,target);
    }
    public static void twoSum(int[]arr,int target) {
        int outputArr[] = new int[2];
        Map<Integer,Integer> hmap =new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (!hmap.containsKey(target - arr[i])) {
                hmap.put(arr[i],i);
            } else {
                outputArr[0] = hmap.get(target-arr[i]);
                outputArr[1] = i;
            }
        }
        System.out.println(Arrays.toString(outputArr));

    }
}
