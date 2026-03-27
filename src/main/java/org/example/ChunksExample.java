package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChunksExample {
    //   chunk([1,2,3,4,5,6],3)-->[[1,2,3],[4,5,6]]
    //   chunk([1,2,3,4,5,6,7],2)-->[[1,2],[3,4],[5,6],[7]]

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int target = 2;
        System.out.println(chunk(list,target));
    }
    public static List<List<Integer>>chunk(List<Integer> list, int target) {
        int count=0;
        List<List<Integer>> res = new ArrayList<>();
       for(int i=0;i<list.size();) {
           List l1 = new ArrayList();
           while(i<count+target && i < list.size()) {
               l1.add(list.get(i));
               i++;
           }
           count = count+target;
           res.add(l1);
       }
       return res;
    }
}
