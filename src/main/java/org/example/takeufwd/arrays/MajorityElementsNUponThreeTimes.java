package org.example.takeufwd.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsNUponThreeTimes {
    public static void main(String[] args) {
        int arr [] = new int [] {11,33,33,11,33,11};
        Map<Integer,Integer> hmap = new HashMap<>();
        List<Integer> arrList = new ArrayList<>();
        for(int i=0 ; i<arr.length; i++) {
            if( hmap.get(arr[i]) ==null) {
                hmap.put(arr[i],1);
            } else {
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> map : hmap.entrySet()) {
            if (map.getValue()> arr.length/3){
                arrList.add(map.getKey());
            }
        }
        System.out.println(arrList);
    }
}
