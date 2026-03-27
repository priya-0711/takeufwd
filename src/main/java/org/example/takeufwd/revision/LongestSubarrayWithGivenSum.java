package org.example.takeufwd.revision;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
         int k=5 , arr[] = new int[]{2,3,5};
        // int k=1, arr[] = new int[]{-1, 1, 1};
        longestSubArrP(arr,k);
    }


    public static void longestSubArrP(int[]arr,int k) {
        int i = 0,j = 0,sum = 0,maxLen = 0;
        while(i<=j && j < arr.length ) {
            if(sum <= k) {
                sum = sum + arr[j]; // 5 j=2
            }
            while ( sum>k) {
                sum = sum -arr[i]; //8 //5
                i++; //1 //2
            }
            if(sum == k) {
                maxLen = Math.max(maxLen, j - i + 1); //3
            }
            j++;

        }
        System.out.println(maxLen);
    }
}
