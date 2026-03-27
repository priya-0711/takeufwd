package org.example;

import java.util.*;

public class GroupAnagramsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "act", "tac", "dog", "ogd");  // output: [[cat,act,tac],[dog,ogd]]
        System.out.println(groupAnagrams(list));
    }

    public static List<List<String>> groupAnagrams(List<String> list) {
        List<List<String>> anagramsList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : list) {  //cat ->a,c,t ->"act"
            String[] s = str.split(""); //[c,a,t]
            Arrays.sort(s);
            String s1 = String.join("", s);
            List<String> res;
            if (!map.containsKey(s1)) {
                res = new ArrayList<>();
                res.add(str);
                map.put(s1, res); // act:cat
            } else {
                map.get(s1).add(str); //act:cat,act,tac
            }
        }
        for (Map.Entry<String, List<String>> e : map.entrySet())
            anagramsList.add(e.getValue());
        return anagramsList;
    }
}
