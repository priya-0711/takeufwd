package org.example.takeufwd.revision;

public class CountSubArrSumEqualsK {
    public static void main(String[] args) {
        int arr[] = new int [] {3,1,2,4};
        int k = 6; int sum =0; int count =0;
        int i = 0, j = 0;
        while(i<=j && j<arr.length) {
            if (sum <= k) {
                sum = sum + arr[j];
            }
            while(sum > k) {
                sum = sum -arr[i];
                i++;
            }
            if(sum==k) {
                count ++;
            }
            j++;

        }
        System.out.println(count);

    }
}
