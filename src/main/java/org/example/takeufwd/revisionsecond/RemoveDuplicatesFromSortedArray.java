package org.example.takeufwd.revisionsecond;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        /*Input: arr[]=[1,1,2,2,2,3,3]
         [1,2,3,_,_,_,_]-->output=3
        Explanation: Total number of unique elements are 3, i.e[1,2,3]
        and Therefore return 3 after assigning [1,2,3] in the beginning of the array.*/
        int[] arr = new int[] {1,1,2,2,2,3,3,4,4};
        int i=0;
        for (int j=1;j<arr.length;j++) {
            if(arr[i]==arr[j]) {
                continue;
            } else {
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println(i+1);
    }
}
