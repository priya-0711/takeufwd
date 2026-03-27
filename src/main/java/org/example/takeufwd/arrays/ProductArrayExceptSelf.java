package org.example.takeufwd.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int []nums =new int[] {1, 2, 3, 4};
        int[] res = new int[nums.length];
       // prefix product
        res[0]=1;
        for(int i=1;i<nums.length;i++) {
            res[i] =  res[i-1]* nums[i-1];
        }
        // suffix product
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--) {
            res[i] = res[i]*suffix;
            suffix = suffix * nums[i];
        }
        System.out.println(Arrays.toString(res));

    }
}
