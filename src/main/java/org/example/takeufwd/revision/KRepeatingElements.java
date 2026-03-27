package org.example.takeufwd.revision;

import java.util.*;
import java.util.stream.Collectors;

public class KRepeatingElements {
    public static void main(String[] args) {
        int [] nums = new int[] {1, 1, 1, 2, 2, 3}; int k = 2;
        kRepEle(nums,k);
    }
    public static void kRepEle(int[]nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> ll= new ArrayList<>();
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
       list.sort( (e1,e2) -> e2.getValue().compareTo(e1.getValue()));
       for(int i=0;i<k && i<list.size();i++){
           ll.add(list.get(i).getKey());
       }
        System.out.println(ll);

       //java 8

        System.out.println(Arrays
                .stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .map(x->x.getKey()).collect(Collectors.toUnmodifiableList())
        );

    }
}
