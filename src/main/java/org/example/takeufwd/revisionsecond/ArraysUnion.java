package org.example.takeufwd.revisionsecond;

import java.util.HashSet;
import java.util.Set;

public class ArraysUnion {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,6,7,9,9};
        int[] nums2 = new int[]{1,5,7,8,8};
        // output-->[1,3,4,5,6,7,8,9]

        Set<Integer> hset = new HashSet<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<=nums2[j]) {
                hset.add(nums1[i]);
                i++;
            } else if(nums1[i]>nums2[j]) {
                hset.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length) {
            if(!hset.contains(nums1[i])) {
                hset.add(nums1[i]);
            }
            i++;
        }
        while(j<nums2.length) {
            if(!hset.contains(nums2[j])) {
                hset.add(nums2[j]);
            }
            j++;
        }
        System.out.println(hset);
    }
}
