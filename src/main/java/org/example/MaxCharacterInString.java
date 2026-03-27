package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxCharacterInString {
    public static void main(String[] args) {
        //    maxChar("abcccccccd") === "c"
        //    maxChar("apple 1231111") === "1"
        String str = "apple 1231111";
        String st = str.replaceAll("\\s+","");
        Map<Character,Integer> map = new HashMap<>();
        int count=1;
          for(int i=0;i<st.length();i++) {
              if(!map.containsKey(st.charAt(i))) {
                  map.put(st.charAt(i),count);
              } else {
                 map.put(st.charAt(i),++count);
              }
          }
        System.out.println(map);
          int max =0; char key=0;
          for(Map.Entry<Character,Integer> m : map.entrySet()) {
              if(m.getValue()>max) {
                  max= m.getValue();
                  key = m.getKey();
              }
          }
        System.out.println(key +"="+max);
          //java8
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }
}
