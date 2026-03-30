package org.example.takeufwd.revisionsecond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArr {
    public static void main(String[] args) {
        /*Input:
        arr = [10, 22, 12, 3, 0, 6]
        Output:
        22 12 6
        Explanation:
        6 is a leader because there are no elements after it.
        12 is greater than all the elements to its right (3, 0, 6), and 22 is greater than 12, 3, 0, 6, making them leaders as well.*/

        int[] arr = new int [] {10, 22, 12, 3, 0, 6};
        List<Integer> list = new ArrayList<>();
        int leader  = arr[arr.length-1];
        list.add(leader);
        for(int i=arr.length-2;i>=0;i--) {
            if(arr[i]> leader) {
                leader = arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
