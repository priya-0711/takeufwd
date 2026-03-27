package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReversal {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","Mango","Banana","Grapes");
        //output: ["elppa","ognaM","ananaB","separG"]

        System.out.println(reverseList(list));
    }
    public static List<String> reverseList(List<String> list) {
        List<String> revList = new ArrayList<>();
       // #approach-1 using reverse() method

        /*for(String str: list) {
            StringBuilder sb =new StringBuilder(str);
            revList.add(sb.reverse().toString());

        }*/
        // #approach-2 using reverse() method

        for(String str : list) {
            String rev = "";
            for(int i=str.length()-1;i>=0;i--) {
                rev= rev + str.charAt(i);
            }
            revList.add(rev);
        }
        return  revList;
    }
}
