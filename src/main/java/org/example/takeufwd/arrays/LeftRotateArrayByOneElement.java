package org.example.takeufwd.arrays;

public class LeftRotateArrayByOneElement {
    public static void main(String[] args) {
        int[]arr = new int[]{1, 2, 3, 4, 5};
       leftRotateByOneElement(arr);
    }
    public static void leftRotateByOneElement(int[]nums) {
        int temp = nums[0];
        int i=0;
        for(int j=1;j<=nums.length-1;j++){
            nums[i]= nums[j];
            i++;
        }
        nums[nums.length-1] = temp;
        for(int k=0;k<nums.length;k++)
            System.out.print(nums[k]+" ");
    }
}
