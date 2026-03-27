package org.example.takeufwd.revision;

public class KadanesAlgoMAxSubArrSum {
    public static void main(String[] args) {
        int arr[] = new int [] {-2,1,-3,4,-1,2,1,-5,4};
        int sum =0,maxL=0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
            maxL = Math.max(maxL , sum);
            if(sum<0) sum =0;
        }
        System.out.println(maxL);
    }
}
