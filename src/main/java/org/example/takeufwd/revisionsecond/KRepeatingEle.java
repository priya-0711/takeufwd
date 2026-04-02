package org.example.takeufwd.revisionsecond;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KRepeatingEle {
    public static void main(String[] args) {
        int [] nums = new int[] {1, 1, 1, 2, 2, 3}; int k = 2;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!hmap.containsKey(nums[i])) {
                hmap.put(nums[i],1);
            } else {
                hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
            }
        }
        System.out.println(hmap.entrySet().stream().filter(x->x.getValue()>=k).map(x->x.getKey()).collect(Collectors.toUnmodifiableList()));
    }
}
