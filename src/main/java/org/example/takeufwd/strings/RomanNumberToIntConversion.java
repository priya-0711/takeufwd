package org.example.takeufwd.strings;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberToIntConversion {
    public static void main(String[] args) {
        String s = "XL";
        romanNumberToInt(s);

    }
    public static void romanNumberToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0; int prevValue=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i = s.length()-1; i >= 0; i--) {
           int currValue = map.get(s.charAt(i)).intValue(); //1 //1
           if(prevValue <= currValue)
               res = res + currValue; //1
           else
               res = res -  currValue; //0

           prevValue = currValue; //1

        }
        System.out.println(res);
    }
}
