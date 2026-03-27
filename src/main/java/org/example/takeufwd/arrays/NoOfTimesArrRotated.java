package org.example.takeufwd.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoOfTimesArrRotated {
    public static void main(String[] args) {
    //    int arr[] = new int[] {4,5,6,7,0,1,2,3};
        List<Integer> list = Arrays.asList(4,5,6,7,0,1,2,3);

        int min = Integer.MAX_VALUE; int minIndex=-1;
        for(int i=0;i<list.size();i++) {
            if(list.get(i)<min){
                min =list.get(i);
                minIndex=i;

            }
        }
        System.out.println(minIndex);
    }
}
