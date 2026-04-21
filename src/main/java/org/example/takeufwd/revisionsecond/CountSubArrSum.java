package org.example.takeufwd.revisionsecond;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrSum {
    public static void main(String[] args) {
        /*
        Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.
        A subarray is a contiguous non-empty sequence of elements within an array.
        Input : N = 4, array[] = {3, 1, 2, 4}, k = 6
        Output: 2
        Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
         */
        //sliding window approach but does not work for all the cases
        //-----------------------------------------------------------
        int arr[] = {1,2,3,0,0};
        int k = 3;
        int i=0,j=0,sum=0,maxLen=0;
        while(j<arr.length) {
                sum = sum + arr[j];
            while(sum>k) {
                sum = sum-arr[i];
                i++;
            }
            if(sum==k) {
                maxLen++;
            }
            j++;
        }
        System.out.println(maxLen);

        //optimal soln for all the test cases
        // Size of the array
        int n = arr.length;

        // Map to store frequency of prefix sums
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize  sum and count of subarrays
        int SUM = 0;
        int count = 0;

        // Base case:  sum 0 has occurred once
        map.put(0, 1);// {0,1}

        // Traverse through the array
        for (int x = 0; x < n; x++) {
            SUM += arr[x]; //6

            // If this  sum has been seen before,
            // add its count to the result
            if (map.containsKey(SUM - k)) { //-2 //0 //3
                count = count + map.get(SUM - k); //1 //2 //3
            }

            // Update the frequency of the current  sum
            map.put(SUM, map.getOrDefault(SUM, 0) + 1); //{1,1} {3,1} {6,1}
        }

        // Return the total count of subarrays
        System.out.println(count);


    }
}
