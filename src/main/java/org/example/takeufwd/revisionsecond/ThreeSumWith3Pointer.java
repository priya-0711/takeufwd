package org.example.takeufwd.revisionsecond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ThreeSumWith3Pointer {
    public static void main(String[] args) {
        int nums[] = new int[] {-1,0,1,0}; /*
        Output:
 [[-1,-1,2],[-1,0,1]]
        */
        List<List<Integer>> finalList = new ArrayList<>();
        int target =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i]== nums[i-1]) continue;
            int left = i+1 ;
            int right = nums.length - 1;
            while(left<right) {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target) {
                   finalList.add(Arrays.asList(nums[i],nums[left],nums[right]));
                   while(left<right && nums[left] == nums[left+1]) left++;
                   while(left<right && nums[right] == nums[right-1]) right--;
                   left++;
                   right--;
                } else if(sum<target) {
                    left++;
                }  else {
                    right--;
                }
            }
        }
        System.out.println(finalList);
    }
}
