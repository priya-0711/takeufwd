package org.example.takeufwd.arrays.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 4, 0, 10};
        int target =4;
        System.out.println(linearSearch(arr,target));
    }
    public static int linearSearch(int[]arr,int target){
        int j=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]== target){
               return i;
            }
        }
         return j;
    }
}
