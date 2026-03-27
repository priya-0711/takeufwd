package org.example.takeufwd.arrays;

import java.util.Arrays;

public class FirstAndLastPositionOfEleInSortedArr {
    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int arr[] = new int[2];
        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);
        System.out.println(Arrays.toString(arr));
    }

    public static int findFirst(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target <= nums[mid]) { //move mid to left
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    public static int findLast(int[] nums, int target) {

        int ind = -1;
        int st = 0;
        int en = nums.length - 1;
        while (st <= en) {

            int mid = (st + en) / 2;
            if (target >= nums[mid]) { //move mid to right
                st = mid + 1;
            } else {
                en = mid - 1;
            }
            if (nums[mid] == target) {
                ind = mid;
            }
        }
        return ind;
    }
}
