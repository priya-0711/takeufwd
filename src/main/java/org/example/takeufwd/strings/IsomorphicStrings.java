package org.example.takeufwd.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s ="apple" , t= "faang";
        System.out.println(isomorphStr(s,t));
    }
    public static boolean isomorphStr(String s,String t) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> hset = new HashSet<>();
        if(s.length()!=t.length()) {
            return false;
        }
        else {
            for(int i=0;i<s.length();i++) {
                char schar = s.charAt(i);
                char tchar = t.charAt(i);
                if (map.containsKey(schar)) {
                    if(map.get(schar)!=tchar) {
                        return false;
                    }
                } else if(hset.contains(tchar)) {
                   return false;
                } else {
                    map.put(schar,tchar);
                    hset.add(tchar);
                }
            }
        }
        return true;



    }
}
