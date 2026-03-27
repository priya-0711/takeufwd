package org.example.takeufwd.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringWordsReversal {
    public static void main(String[] args) {
        String s ="the sky is blue ";
       reverseWords(s);
    }
    public static void reverseWords(String s) {
        String[] strr = s.trim().replaceAll("\\s+"," ").split(" ");
        StringBuilder sb = new StringBuilder();

      for(int i=strr.length-1;i>=0;i--) {
          sb.append(strr[i]+" ");
      }
        System.out.println(sb.toString().trim());


      // java 8 approach

        String[] str = s.trim().split("\\s+");

        List l =Arrays.asList(str);
        Collections.reverse(l);
        System.out.println(String.join(" ",l));
         }
}
