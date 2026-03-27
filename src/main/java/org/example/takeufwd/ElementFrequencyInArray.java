package org.example.takeufwd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFrequencyInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{10,5,10,15,10,5};
        countElementFrequency(arr);
    }
    public static List<List<Integer>> countElementFrequency(int[]arr) {
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> finalList = new ArrayList<>();

        for(int i=0;i<arr.length;i++) {
            if(!map.containsKey(arr[i])){
              map.put(arr[i],1);
            } else {
                int count = map.get(arr[i]);
                map.put(arr[i],++count);
            }
        }
        System.out.println(map);
        System.out.print(map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey() +" ");

        for(Map.Entry<Integer,Integer> m :map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(m.getKey());
            list.add(m.getValue());
            finalList.add(list);
        }
             return finalList;
    }
}
