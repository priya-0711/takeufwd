package org.example.takeufwd.revisionsecond;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        /*
        Given an array nums of n integers.
        Return the length of the longest sequence of consecutive integers.
        The integers in this sequence can appear in any order.
        Input:
 nums = [100, 4, 200, 1, 3, 2]
Output:
 4
Explanation:
 The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4.
 This sequence can be formed regardless of the initial order of the elements in the array.
         */
        int[] nums = new int[]{100, 101, 200, 1,  2};
        int longest=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(Integer i : set) {
            if(!set.contains(i-1)) {
                int s =i;
                int count =1;
                while(set.contains(s+1)) {
                    count++;
                    s=s+1;
                }
                longest = Math.max(longest,count);
            }
        }
        System.out.println(longest);

    }
}
