package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatingAndMissingNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{3,1,2,5,3}; //{5,8)
        int sumofUniqueArrEle = 0;
        int sumOfNNos =0;
        int N = arr.length;
        int []  finalArr = new int[2];

        Map<Integer,Integer> hmap = new HashMap<>();
        for( int i=0 ;i<arr.length;i++) {
          if (!hmap.containsKey(arr[i])) {
              hmap.put(arr[i],1);
          } else {
              hmap.put(arr[i],hmap.get(arr[i])+1);
          }
        }
        System.out.println(hmap);
        for(Map.Entry<Integer,Integer> m :hmap.entrySet()) {
            if (m.getValue() > 1) {
                finalArr[0] = m.getKey();
            }
            sumofUniqueArrEle = sumofUniqueArrEle + m.getKey(); //28
            sumOfNNos = N * (N+1) /2 ;
        }
        finalArr[1] =sumOfNNos - sumofUniqueArrEle;
        System.out.println(Arrays.toString(finalArr));

    }
}
