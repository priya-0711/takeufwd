package org.example.takeufwd.strings;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class sortStringCharByFrequency {
    public static void main(String[] args) {
        String s = "tree the";
        System.out.println(s.length());
        System.out.println(sortCharByFreq(s));
    }

    public static String sortCharByFreq(String s) {
        // Your code goes here
        StringBuilder sb = new StringBuilder();



       return Arrays.stream(s.split("")).collect(Collectors.groupingBy(str->str,Collectors.counting())).entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
                .flatMap(st -> Collections.nCopies(st.getValue().intValue(),st.getKey()).stream()).collect(Collectors.joining());



    }
}
