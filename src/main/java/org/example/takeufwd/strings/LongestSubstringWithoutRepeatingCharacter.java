package org.example.takeufwd.strings;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        /*
        Problem Statement: Given a string, S. Find the length of the longest substring without repeating characters.
        Input:
        S = "abcddabac"
       Output: 4
       Explanation: The longest substring with distinct characters is "abcd", which has a length of 4.
*/
        String str = "abcabcdbb";
        int maxLen=Integer.MIN_VALUE;
        //brute force
        for(int i=0;i<str.length();i++) {
            int[]hash = new int[256];
            Arrays.fill(hash,0);
            for(int j=i;j<str.length();j++) {
                if(hash[str.charAt(j)] == 1)  break;
                hash[str.charAt(j)] =1;
                int len = j-i+1;
                maxLen = Math.max(len,maxLen);

            }
        }
        System.out.println(maxLen);

        //2 pointer
        int left=0,right=0,maxL=0;
        int[] arr = new int[256];

        while(right<str.length()) {
            if(arr[str.charAt(right)]==1) {
                arr[str.charAt(left)]=0;
                left++;
            } else {
                arr[str.charAt(right)] = 1;
                int le = right - left + 1;
                maxL = Math.max(le, maxL);
                right++;
            }
        }
        System.out.println(maxL);

    }
}
