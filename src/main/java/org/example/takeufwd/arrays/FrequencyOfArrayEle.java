package org.example.takeufwd.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayEle {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 2, 4, 3, 1, 4};
        System.out.println(frequencyOfEle(arr));
    }
    public static int frequencyOfEle(int[]arr) {
        if(arr.length==0) return -1;
        Map<Integer,Integer> map = new HashMap<>(); int minValue=0;
        for(int i=0;i<arr.length;i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            } else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()) {
           if(m.getValue()==1) {
               minValue =m.getKey();
           }
        }
       return minValue;
    }
}
