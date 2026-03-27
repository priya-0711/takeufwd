package org.example.takeufwd.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 6}, {8,9}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
    }
        public static List<List<Integer>> mergeOverlappingIntervals ( int[][] arr){
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0]- o2[0];
                }
            });
            List<List<Integer>> list = new ArrayList<>();
            for (int i=0;i<arr.length;i++) {
                if(list.isEmpty() || arr[i][0] > list.get(list.size()-1).get(1)) {
                    list.add(Arrays.asList(arr[i][0], arr[i][1])); //[[1,4]]
                } else {
                    arr[i][1] = Math.max(list.get(list.size()-1).get(0),arr[i][1]);
                    list.get(list.size()-1).set(1,arr[i][1]);
                }
            }
            System.out.println(list);
            return list;
        }
    }

