package org.example.takeufwd.revisionsecond.searching;

public class SearchSingleEleInSortedArr {
    public static void main(String[] args) {
        /*
        Given an array of N integers.
        Every number in the array except one appears twice.
        Find the single number in the array
       */
        int [] arr =  {1,1,2,3, 3, 4,4,8,8};

        //if first element is unique
            if (arr[0] != arr[1]) {
                System.out.println(arr[0]);

            }
        // if last ele is unique
            if(arr[arr.length-1]!= arr[arr.length-2]) {
                System.out.println(arr[arr.length-1]);

            }
        int left = 1, right = arr.length-2;
            while(left<=right) {
                int mid = (left + right) / 2;
                // if mid is unique single ele
                if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                    System.out.println(arr[mid]);
                }
                if( (mid%2 ==0 && arr[mid] == arr[mid+1]) || // even index
                        (mid%2 ==1 && arr[mid] == arr[mid-1]) ) { // odd index
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }


    }
}
