package org.example.takeufwd;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = new int[]{12,23,31,34};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr) {
        for(int round=1;round<arr.length;round++) {
            int flag =0;
        for(int i=0;i<arr.length-round;i++) {
            if (arr[i] > arr[i + 1]) {
                flag = 1;
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        if(flag==0)
            return;
        else
            System.out.println(Arrays.toString(arr));
    }


    }
}
