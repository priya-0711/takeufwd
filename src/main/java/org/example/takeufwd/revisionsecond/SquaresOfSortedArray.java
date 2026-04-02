package org.example.takeufwd.revisionsecond;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        /*
        Input:
[-4, -1, 0, 3, 10]

Output:
[0, 1, 9, 16, 100]
         */
        int nums [] = new int[] {-4, -1, 0, 3, 10}; //[4,1,0,3,10]
        int i=0,j=nums.length-1,index=nums.length-1;
        int[]res = new int[nums.length];
        while(i<=j) {
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[index] =nums[i] * nums[i];
                i++;
            } else {
                res[index] = nums[j]*nums[j];
                j--;
            }
            index--;
        }
        System.out.println(Arrays.toString(res));

    }
}
