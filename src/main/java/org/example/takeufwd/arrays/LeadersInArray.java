package org.example.takeufwd.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int nums[] = new int[] {10, 22, 12, 3, 0, 6};
        System.out.println(leadersArr(nums));
    }
    public static List<Integer> leadersArr(int[]nums) {
        List<Integer> list = new ArrayList<>();
        int max = nums[nums.length-1];
        list.add(max);
        for(int i=nums.length-2;i>=0;i--) {

            if(nums[i]>max) {
                list.add(nums[i]);
                max = nums[i];
            }
        }

       Collections.reverse(list);
        return list;
    }
}
