package org.example.takeufwd.strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] str = {"flowe","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        StringBuilder output= new StringBuilder();
       for(int i=0;i<(Math.min(first.length(),last.length()));i++) {
           if (first.charAt(i)!= last.charAt(i)) {
               return output.toString();
           }
           output.append(first.charAt(i));
       }
        return output.toString();
    }
}
