package org.example.takeufwd.revision;

import java.util.Arrays;

public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        int arr[] = new int[]{2,0,2,1,1,0};
        //3 pointer approach
        int low=0,mid=0,high=arr.length-1;
       while(mid<=high) {
           if(arr[mid]==2) {
               //swap till last one
               int temp = arr[mid];
               arr[mid]= arr[high];
               arr[high] = temp;
                high--;
           } else if( arr[mid]==1) {
               mid++;
           } else  {
               int temp = arr[low];
               arr[low]= arr[mid];
               arr[mid]= temp;
               low++;mid++;

           }
       }
        System.out.println(Arrays.toString(arr));

    }
}
