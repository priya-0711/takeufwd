package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEleOccurenceInArr {
    public static void main(String[] args) {
        int [] arr = new int[]{0, 0, 1, 1, 1, 2,2, 3}; int target = 0;
        int count=0;
        for(int i=0; i<arr.length;i++) {
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(
                Arrays
                .stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet() //[0=2,1=3,2=1,3=1]
                .stream()
                .filter(x->x.getKey() == target)
                .map(x->x.getValue())
        );

        System.out.println(
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(x->x.getValue()==1)
                        .map(x->x.getKey()).findAny().get()

        );
    }
}
