package org.example.takeufwd.strings;

import java.util.*;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String s = "ababc";   //[a,ab,aba,abab,ababc,...]
        substring(s);
    }
    public static List<String> substring(String input){
        //optimal approach for generating all substrings
       List<String> list = new ArrayList<>();
         for( int i=0;i < input.length();i++) {
             for(int j=i;j < input.length();j++) {
               list.add(input.substring(i,j+1));
           }
       }
       //all subsets
        System.out.println(list);
        System.out.println(list.size());
       // distinct subsets and its count
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
       return list;


    }
}
