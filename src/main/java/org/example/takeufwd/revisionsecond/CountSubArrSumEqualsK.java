package org.example.takeufwd.revisionsecond;

public class CountSubArrSumEqualsK {
    public static void main(String[] args) {
        //sliding window problem

        /*
        Input : N = 4, array[] = {3, 1, 2, 4}, k = 6
        Output: 2
        Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
        */
        int[] array = new int[]{1,2,3}; int k = 3;
        int left=0,right=0,sum=0,count=0;
        while(left<=right && right<array.length) {
            if(sum<=k) {
                sum = sum + array[right];
            }
            while(sum>k) {
                sum = sum - array[left];
                left++;
            }
            if(sum == k) count++;
            right++;
        }
        System.out.println(count);
    }
}
