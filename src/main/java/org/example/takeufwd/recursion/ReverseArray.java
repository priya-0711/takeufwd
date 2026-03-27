package org.example.takeufwd.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr =new int[]{1,2,3,4,5};
   //     reverseArray(5,arr);
  //     reverseArrayOptimal(5,arr);
        reverseArrayByRecursion(arr,0,arr.length-1);
        printArray(arr);
    }
    public static int[] reverseArray(int n,int[]arr) {
        int[] revArr = new int[n] ; //increases space complexity
       for(int i=0;i<arr.length;i++) {
           revArr[i] = arr[arr.length-i-1];
           System.out.println(revArr[i]);
       }
        return revArr;
    }

    //optimal approach //less time and space complexity
    //    [1,2,3,4,5] ->[5,4,3,2,1]
    public static void reverseArrayOptimal(int n,int[]arr) {
        for(int i=0;i<(arr.length/2);i++) {
            int temp = arr[i]; //temp = 1 //temp=2
            arr[i] = arr[arr.length-i-1]; //arr[0] = arr[4] ->[5,2,3,4,]  //arr[1]=arr[3]->[5,4,3,,1]
            arr[arr.length-i-1] = temp; //arr[4]= 1 ->[5,2,3,4,1] // arr[3]=2 ->[5,4,3,2,1]
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArrayByRecursion(int[]arr,int start, int end) { //    [1,2,3,4,5] ->[5,4,3,2,1]
       //  base hypo induction
      //  base condition
        if(start>=end){
            return;
        }
        //induction
       // swapping
         int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        //hypotheses
        reverseArrayByRecursion(arr,start+1,end-1);
    }
    public static void printArray(int[]arr){
        System.out.println(Arrays.toString(arr));
    }

}
