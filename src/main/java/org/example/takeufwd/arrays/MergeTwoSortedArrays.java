package org.example.takeufwd.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
       int[]  nums1 = new int[] {0, 2, 7, 8, 0, 0, 0} ;
       int[] nums2 = new int[] {-7, -3, -1};
       int i = 3,j = 2, k = 6;
       while(i>=0 && j>=0) {
           if(nums1[i] < nums2[j]) {
               nums1[k] = nums2[j];
               k--;j--;
           } else if (nums1[i] >nums2[j]) {
               nums1[k] = nums1[i];
               i--;k--;
           }
       }
       while(j>=0) {
           nums1[k] = nums2[j];
           k--;j--;
       }
        System.out.println(Arrays.toString(nums1));
    }
}
