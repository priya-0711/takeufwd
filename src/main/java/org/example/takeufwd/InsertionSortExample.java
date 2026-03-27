package org.example.takeufwd;

import java.awt.event.WindowStateListener;
import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[]arr = new int[]{31,45,11,55,89,21};
        insertionSort(arr);
    }
    public static void insertionSort(int[]arr) {
        for(int i=1;i<arr.length;i++) {
            int temp =arr[i];
            for(int j=i-1;j>=0 && temp<arr[j];j--) {
                //swap
                arr[j+1]=arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
