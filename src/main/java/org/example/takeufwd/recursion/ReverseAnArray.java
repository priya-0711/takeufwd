package org.example.takeufwd.recursion;

import java.util.Arrays;

public class ReverseAnArray {

    /**
     * Reverses the given array in-place.
     *
     * @param arr the array to reverse
     */
    public static void reverseArray(int[] arr) {
        // TODO: Developer implements this
        for(int i=0;i<(arr.length/2);i++) {
            int temp = arr[i]; //temp = 1 //temp=2
            arr[i] = arr[arr.length-i-1]; //arr[0] = arr[4] ->[5,2,3,4,]  //arr[1]=arr[3]->[5,4,3,,1]
            arr[arr.length-i-1] = temp; //arr[4]= 1 ->[5,2,3,4,1] // arr[3]=2 ->[5,4,3,2,1]
        }
        System.out.println(Arrays.toString(arr));
    }

    // --- Test Harness ---
    public static void main(String[] args) {
        runTests();
    }

    private static void runTests() {
        int testCount = 1;

        testCount = runSingleTest(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}, testCount);
        testCount = runSingleTest(new int[]{1, 2, 1, 1, 5, 1}, new int[]{1, 5, 1, 1, 2, 1}, testCount);
        testCount = runSingleTest(new int[]{42}, new int[]{42}, testCount);
        testCount = runSingleTest(new int[]{}, new int[]{}, testCount);
        testCount = runSingleTest(new int[]{10, 20, 30, 40}, new int[]{40, 30, 20, 10}, testCount);
        testCount = runSingleTest(new int[]{7, 8, 9}, new int[]{9, 8, 7}, testCount);
        testCount = runSingleTest(new int[]{-1, -2, -3, -4}, new int[]{-4, -3, -2, -1}, testCount);
        testCount = runSingleTest(new int[]{100, 200, 300, 400, 500, 600}, new int[]{600, 500, 400, 300, 200, 100}, testCount);
        testCount = runSingleTest(new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, testCount);
        testCount = runSingleTest(new int[]{1, 2}, new int[]{2, 1}, testCount);

        System.out.println("All tests executed.");
    }

    private static int runSingleTest(int[] input, int[] expected, int testNumber) {
        int[] copy = java.util.Arrays.copyOf(input, input.length);
        reverseArray(copy);

        if (java.util.Arrays.equals(copy, expected)) {
            System.out.println("Test " + testNumber + " PASSED ✅");
        } else {
            System.out.println("Test " + testNumber + " FAILED ❌");
            System.out.println("   Input:     " + java.util.Arrays.toString(input));
            System.out.println("   Expected:  " + java.util.Arrays.toString(expected));
            System.out.println("   Got:       " + java.util.Arrays.toString(copy));
        }

        return testNumber + 1;
    }
}
