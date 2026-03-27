package org.example.takeufwd.strings;

import java.util.*;

public class PrintSubStringsWithKDistinctElements {
    public static void main(String[] args) {
        String s = "ababc"; int k =2;
     //   output: [ab,aba,abab,ba,bab,ab,bc]
        System.out.println(printKDistinctSubStrings(s,k) - printKDistinctSubStrings(s,k-1));
    }
    public static int printKDistinctSubStrings(String s,int k) {
        //brute force approach
        //1. find out all the possible strings
        /*List<String> list = new ArrayList<>();
        List<String> output = new ArrayList<>();
        for(int i =0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                list.add(s.substring(i,j+1));
            }
        }
        // 2. iterate the list of all strings and then put it in map with the characters and their frequency.
        for(String str : list) {
            Map<Character,Integer> map = new HashMap<>();
            char [] ch = str.toCharArray();
            for(char c : ch) {
                map.put(c, map.getOrDefault(ch, 0) + 1);
            }
            // 3. fetch keys of map and check their size matches with k to get the substrings with k distinct ele
            Set<Character> set = map.keySet();
            if(set.size()==k) {
                output.add(str);
            }
        }
        System.out.println(output);
        return output.size();*/

        // optimal approach- sliding window
       if(k<0) return 0;
        int i =0;int j =0;int count =0 ;
       Map<Character,Integer> map = new HashMap<>();
        while(j<s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1); //a=2,b=2,c=1

            while (map.size() > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar)-1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
                i++;
            }
            count = count+j-i+1;
            j++;
        }
        return count;
    }
}
