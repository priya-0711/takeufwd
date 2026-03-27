package org.example.takeufwd.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
        int[]arr=new int[]{-1,1,1};
        int k =1;
        longestSubArray(arr,k);
    }
    public static int longestSubArray(int[]arr,int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum  = 0,maxLen =0; int len;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i]; //2, 5 ,10 ,14 ,15
            if(sum ==k){
                maxLen =Math.max(maxLen,i+1); //2
            }
            int rem = sum-k; //0 5 11 10
            if(map.containsKey(rem)){
                len= i- map.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i); //2=0 //5,1 //10,2 //14,3 //15,4
            }
        }
        System.out.println(maxLen); //2
        return maxLen;
    }
}
