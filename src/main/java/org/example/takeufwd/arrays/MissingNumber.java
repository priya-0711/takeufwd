package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[]arr) {
       /* int n = nums.length+1;
        int sumOfNNumb= n*(n+1)/2;
        int sumofArrayElements =0;
        for(int i =0;i< nums.length;i++) {
            sumofArrayElements = sumofArrayElements + nums[i];
        }
        return sumOfNNumb - sumofArrayElements;*/
        int n = arr.length + 1;

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If the current number is not present
            if (!found)
                return i;
        }
        return -1;
    }
}
