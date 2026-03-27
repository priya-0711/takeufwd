package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 5, 1, 4,6};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[]nums) {
        int n = nums.length;
        int sumOfNNumb= n*(n+1)/2;
        int sumofArrayElements =0;
        for(int i =0;i< nums.length;i++) {
            sumofArrayElements = sumofArrayElements + nums[i];
        }
        return sumOfNNumb - sumofArrayElements;
    }
}
