package org.example.takeufwd.arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int [] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4 };
        System.out.println(maxSubArrSum(arr));
    }
    public static int maxSubArrSum(int[]arr) {
        int sum=0,maxLen=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
           maxLen=Math.max(sum,maxLen);
           /* if(sum>maxLen){
                maxLen=sum;

            }*/

           if(sum<0) sum=0;
        }
        return maxLen;
    }
}
