package org.example.takeufwd.revisionsecond;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrWith0Sum {
    public static void main(String[] args) {
        /*
        Given an array containing both positive and negative integers,
        we have to find the length of the longest subarray with the sum of all elements equal to zero.
        Input: N = 6,
        array[] = {9, -3, 3, -1, 6, -5}
        Result: 5
Explanation:
 The following subarrays sum to zero:
- {-3, 3}
- {-1, 6, -5}
- {-3, 3, -1, 6, -5}
The length of the longest subarray with sum zero is 5.
         */
        int[] array = new int[]{9, -3, 3, -1, 6, -5};
        int sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if( sum == 0) {
                maxLen = i+1;
            } else {
                if (!hmap.containsKey(sum)) {
                    hmap.put(sum, i);
                } else {
                    maxLen = Math.max(i, hmap.get(sum));
                }
            }
        }
        System.out.println(maxLen);
    }
}
