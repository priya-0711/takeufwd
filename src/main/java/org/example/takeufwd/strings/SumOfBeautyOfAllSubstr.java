package org.example.takeufwd.strings;

import java.util.*;

public class SumOfBeautyOfAllSubstr {
    public static void main(String[] args) {
        String s = "aabcbaa";
        int sum =0;
        for(int i =0; i<s.length();i++) {
            Map<Character, Integer> map = new HashMap<>();
            for(int j =i; j<s.length();j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                int max=Integer.MIN_VALUE , min= Integer.MAX_VALUE;
                for(Integer x:map.values()) {

                   max = Math.max(max,x.intValue());
                   min = Math.min(min,x.intValue());
                }
                sum = sum +(max-min);

            }
        }
        System.out.println(sum);

    }
}
