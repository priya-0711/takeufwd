package org.example.takeufwd.arrays;

public class ConsecutiveOnesCount {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,0,1,1,0,1};
        System.out.println(countConsecuteOne(arr));
    }
    public static int countConsecuteOne(int[]arr) {
        int count=0,maxCount=0;
        for(int i =0; i <arr.length;i++) {
            if(arr[i]==1) {
                count++;
            } else {
                count = 0;
            }
            maxCount= Math.max(maxCount,count);
        }
       return maxCount;

    }
}
