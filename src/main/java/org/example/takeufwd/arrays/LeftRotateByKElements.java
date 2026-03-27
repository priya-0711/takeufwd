package org.example.takeufwd.arrays;

public class LeftRotateByKElements {
    public static void main(String[] args) {
        int[][] testArrays = {
            {}, // empty array
            {1}, // single element
            {1, 2, 3, 4, 5}, // k = 0
            {1, 2, 3, 4, 5}, // k = arr.length
            {1, 2, 3, 4, 5}, // k > arr.length
            {1, 2, 3, 4, 5}, // k < arr.length
            {3, 4, 1, 5, 3, -5} // original test
        };
        int[] ks = {0, 1, 0, 5, 7, 2, 8};
        String[] descriptions = {
            "Empty array, k=0:",
            "Single element, k=1:",
            "k=0 (no rotation):",
            "k=arr.length (full rotation):",
            "k>arr.length (should rotate by k%length):",
            "k< arr.length:",
            "Original test, k=8 (should rotate by 2):"
        };
        for (int i = 0; i < testArrays.length; i++) {
            int[] arr = java.util.Arrays.copyOf(testArrays[i], testArrays[i].length);
            System.out.print(descriptions[i] + " ");
            leftRotateByKEle(arr, ks[i]);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void leftRotateByKEle(int[]arr,int k) {
        if(arr.length==0) return;
         k= k% arr.length;
         if( k==0) return;
        reverseByk(arr,0,k-1);
        reverseByk(arr,k,arr.length-1);
        reverseByk(arr,0,arr.length-1);
    }

    public static void reverseByk(int[]arr,int start,int end) {
        while(start<=end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
}
