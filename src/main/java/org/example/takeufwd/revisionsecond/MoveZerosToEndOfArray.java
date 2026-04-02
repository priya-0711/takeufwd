package org.example.takeufwd.revisionsecond;

import java.util.Arrays;

public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        /*Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
        Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
        Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order*/

        int[] arr = new int [] {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int i=0;
        for(int j=0;j<arr.length;j++) {
            if(arr[j]!=0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
