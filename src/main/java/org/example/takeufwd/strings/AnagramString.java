package org.example.takeufwd.strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    public static void main(String[] args) {
        String s = "anagram",t="nagaram";
        System.out.println(anagrams(s.toLowerCase(),t.toLowerCase()));
    }
    public static boolean anagrams(String s, String t ) {
       // array approach more optimal  faster due to array
        // o(n)
     //   ------------------------------
        /*if(s.length()!=t.length()) {
            return false;
        } else {
            int[] count = new int[26];
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }
            for (char ch : t.toCharArray()) {
                count[ch - 'a']--;
            }

            for (int num : count) {
                if (num != 0) return false;
            }
            return true;
        }*/
                //less optimal hashing approach due to hashing its slow o(n)

        Map<Character,Integer> map = new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(char ch : s.toCharArray()) {
            if(!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch,map.get(ch)+1);
            }
        }
        for(char ch : t.toCharArray()) {
            if(!map.containsKey(ch)) {
               return false;
            }
                int count = map.get(ch);
                map.put(ch,count-1);
                if(map.get(ch)==0) {
                    map.remove(ch);
                }
        }
                 return map.isEmpty();
    }
}
