package org.example.takeufwd.arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxRepeatingElement {
    public static void main(String[] args) {
        int nums[] = new int[]{4,4,2,4,3,4,4,3,2,4};
        int N = nums.length;
        System.out.println(majorityEleNBy2(nums,N));
    }
    public static int majorityEleNBy2 (int[]nums,int N) {
        // JAVA 8
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().filter(x->x.getValue()>N/2).map(x->x.getKey()).findFirst().get());

        //JAVA 7
        int maxvalue =0 ;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()) {
            if(m.getValue()>N/2) {
                maxvalue = m.getKey();

            }
        }
    return maxvalue;
    }
}
