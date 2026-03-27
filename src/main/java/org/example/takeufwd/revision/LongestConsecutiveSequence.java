package org.example.takeufwd.revision;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{100, 101, 200, 1,  2};
        System.out.println(consecutiveSequence(nums));
    }

    public static int consecutiveSequence(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        int longest =0;
        for (int i = 0; i < nums.length; i++) {
            hset.add(nums[i]);
        }
        for (int s : hset) {
            if (!hset.contains(s - 1)) {
                int x = s;
                int count = 1;
                while (hset.contains(x+1)) {
                    x= x+1;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
