package org.example.takeufwd.revision;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
    public static void main(String[] args) {
        int nums[] = new int[] {4, 2, 3, 1,3};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[]nums) {
        Map<Integer,Integer> map = new HashMap();
        for( int i =0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()) {
            if(m.getValue()>1) {
                return true;
            }
        }
        return false;
    }
}
