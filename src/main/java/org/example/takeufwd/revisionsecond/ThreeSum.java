package org.example.takeufwd.revisionsecond;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
       /* Input:
        nums = [-1,0,1,2,-1,-4]
        Output:
 [[-1,-1,2],[-1,0,1]]
        Explanation:
        Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k*/
        int [] nums = new int []{-1,0,1,2,-1,-4};
        int target =0;
        Set<List<Integer>> finalList = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            Set<Integer> hset = new HashSet<>();
            for(int j=i+1;j<nums.length;j++) {
                int third = target -nums[i]-nums[j];
                if (!hset.contains(third)) {
                    hset.add(nums[j]);
                } else {
                    List<Integer> list  = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(list);
                   finalList.add(list);
                }
            }
        }
        System.out.println(finalList);


    }
}
