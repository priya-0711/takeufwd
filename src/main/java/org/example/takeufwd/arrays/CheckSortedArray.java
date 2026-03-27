package org.example.takeufwd.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckSortedArray {
    public static void main(String[] args) {
        System.out.println(checkSortedArray(Arrays.asList(1,3,2,4,5)));
    }
    public static boolean checkSortedArray(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
    }
}
