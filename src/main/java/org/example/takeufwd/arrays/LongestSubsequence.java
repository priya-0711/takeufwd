package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,4,100,2,200};
        System.out.println(longestSubSequence(arr));
    }
    public static int longestSubSequence(int[]arr) {
  //      Arrays.sort(arr); //1,2,3,4,100,200
        int longest =0;
        Set<Integer> hset = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            hset.add(arr[i]);
        }
        for (int i : hset) {
            if(!hset.contains(i-1)) {
                int x = i;
                int count = 1;

                while (hset.contains(x + 1)) {
                    x=x+1;
                    count++;
                }
                longest = Math.max(longest,count);
            }

        }
        return longest;
    }
}
