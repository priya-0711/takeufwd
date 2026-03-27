package org.example.takeufwd;

public class SeelctionSortExample {
    public static void main(String[] args) {
        int [] arr = new int[]{45,34,21,12,6,2};
        for(int i=0;i<=arr.length-1;i++) {
            selectionSort(arr,i);
        }
       for (int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
       }
    }

    public static void selectionSort(int[]arr,int i) {
        int minIndex = min(arr,i);
        int temp = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }

    public static int min(int[]arr, int i) {
        int element = arr[i]; //45
        int minIndex = i;   //0
        for(int j=i+1;j<=arr.length-1;j++) {
            if(element > arr[j]) { //45>34
                element = arr[j]; //element=34
                minIndex = j;  // minIndex=1
            }
        }
         return minIndex;

    }
}
