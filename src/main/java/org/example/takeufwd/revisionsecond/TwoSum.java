package org.example.takeufwd.revisionsecond;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,5,8,11};
        int target = 14;
        /*Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
    Output : YES
    Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second variant
     output will be : [1,3].

    Input: N = 5, arr[] = {2,6,5,8,11}, target = 15
    Output : NO.
            Explanation: There exist no such two numbers whose sum is equal to the target.*/

        int[] output = new int[] {-1,-1};
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i< arr.length;i++) {
            if (!hmap.containsKey(target - arr[i])) {
                hmap.put(arr[i],i);
            } else {
                output[0] = hmap.get(target - arr[i]);
                output[1] = i;
            }
        }
        System.out.println(Arrays.toString(output));

    }
}
