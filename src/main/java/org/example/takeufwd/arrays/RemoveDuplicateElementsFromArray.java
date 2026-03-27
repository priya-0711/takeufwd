package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 2, 4, 4, 4, 4, 5, 5};
        System.out.println(removeDuplicateElementsFromArray(arr));
    }
    public static int removeDuplicateElementsFromArray(int[]arr) {
        //java 8
   //   return Math.toIntExact(Arrays.stream(arr).distinct().count());  //sc:o(n) tc:o(n)

      //java 7
       /* Set<Integer> hset = new LinkedHashSet<>();
        for(int a: arr ) {
            hset.add(a);
        }
        return hset.size();  //sc:o(n) tc:o(n)*/

        //2-pointer approach using java7
       int i=0;
        for(int j=1;j<arr.length;j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        return i+1;

    }
}
