package org.example.takeufwd.revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = new int []{2, 11, 15,7}; int target =9;
        twoSum(nums,target);
    }
    public static void twoSum(int[] nums,int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[]{-1,-1};
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(target - nums[i])) {
                map.put(nums[i],i); //1,0  / 2,1 /
            } else {
               res[0] = map.get(target-nums[i]);
               res[1] = i;

            }
        }
        System.out.println(Arrays.toString(res));
    }
}
