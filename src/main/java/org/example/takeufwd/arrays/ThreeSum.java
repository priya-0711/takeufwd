package org.example.takeufwd.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = new int[] {-1,0,1,2,-1,-4};
        int target = 0;
        System.out.println(ThreeSum(arr,target));
    }
    public static List<List<Integer>> ThreeSum (int[] arr , int target) {
        Set<List<Integer>> resList = new HashSet<>();
        for(int i=0 ;i< arr.length; i++) {
            Set<Integer> hset = new HashSet<>();
            for(int j =i+1;j<arr.length;j++) {
                int third  = target-arr[i]-arr[j];
                if(hset.contains(third)) {
                    List<Integer>  list = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(list);
                    resList.add(list);
                } else {
                    hset.add(arr[j]);
                }
            }
        }
        return new ArrayList<>(resList);
    }
}
