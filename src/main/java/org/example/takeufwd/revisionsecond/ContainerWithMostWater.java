package org.example.takeufwd.revisionsecond;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        /*
You are given an integer array height[] of size n, where each element represents the height of a vertical line drawn on the x-axis.
The width between two lines is the distance between their indices
Together, any two lines can form a container
The container can hold water based on the shorter height
Goal: Find two lines such that the container formed between them holds the maximum amount of water.
Input:
height = [1,8,6,2,5,4,8,3,7]

Output:
49
Explanation: max water can be filled by picking index 1 and index 8 which contains value 8 and 7.
min height between 8 and 7 is 7.So,considering it as min height and multiply it with difference between indexes of the heights
as 7 * (8-1)=7*7=49 as max value

         */

        int height [] = new int[] {1,8,6,2,5,4,8,3,7};
        int i=0,j = height.length-1,maxL=Integer.MIN_VALUE;
        while(i<j) {
            int min = Math.min(height[i],height[j]);
            int indexDiff = j-i;
            maxL = Math.max(maxL,(min * indexDiff));
            if(height[i]<=height[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(maxL);
    }
}
