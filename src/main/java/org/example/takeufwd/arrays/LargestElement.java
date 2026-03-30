package org.example.takeufwd.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,67,6,7};
        largestElement(arr);
    }
    public static void largestElement(int[]arr) {
        int max = arr[0]; //max=2
        for(int i=1;i<=arr.length-1;i++) {
            if(max<arr[i] ) {
                max=arr[i];
            }
        }
        System.out.println(max);  //TC:O(n)

        //optimal way using sort method TC:O(nlogn) -- less efficient due to sorting
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        //java 8 -O(n)
        Arrays.stream(arr).max().getAsInt();
    }
}
