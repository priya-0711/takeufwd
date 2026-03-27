package org.example.takeufwd.arrays;

import java.util.Arrays;

public class MoveZerosToArrayEnd {
    public static void main(String[] args) {
        int arr[] =new int[]{-1,2,0,1,0,4,0,3,2,0};
    //    move0ToEnd(arr,0,arr.length-1);
        move0ToEndByInsertionOrder(arr);
    }
    public static void move0ToEnd(int[]arr,int start,int end) {
        //this code works for shifting 0's to end but it will not maintain the insertion order of non-zero elements
        while (start <= end) {
            if (arr[start] != 0 && arr[end] != 0) {
                start++;
            }
            if (arr[start] == 0 && arr[end] != 0) {
                //swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            if (arr[start] != 0 && arr[end] == 0) {
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void move0ToEndByInsertionOrder(int[]arr) {
        int i=0;
        for(int j=0;j<arr.length;j++) {
            if(arr[j]==0 ) {
               i=j; //1
                break;
            }
        }
        for(int j=i+1;j<arr.length;j++) {
            if(arr[j]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        System.out.print(arr[j]+" ");
        System.out.println("");
    }
}
