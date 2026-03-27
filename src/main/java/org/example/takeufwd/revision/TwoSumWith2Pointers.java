package org.example.takeufwd.revision;

import java.util.Arrays;

public class TwoSumWith2Pointers {
    public static void main(String[] args) {
        int [] nums = new int [] {-7,-3,1,3,5,6}; int target=0;
        int[]res = new int[2];
        int i=0,j= nums.length-1;
        while(i<j) {
            if( nums[i]+nums[j]  < target) {
                i++;
            }  if ( nums[i]+nums[j] > target) {
                j--;
            }  if ( nums[i]+nums[j] == target) {
                res[0] = i;
                res[1] = j;
                break;
            }
        }
        System.out.println(Arrays.toString(res));
    }
   // 2-pointers can work here as given rray is sorted
}
