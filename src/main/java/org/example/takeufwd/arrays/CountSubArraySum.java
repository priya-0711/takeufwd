package org.example.takeufwd.arrays;

public class CountSubArraySum {
    public static void main(String[] args) {
        int arr[] = new int [] {1,2,3};
        int k =3; int sum =0;
         int count=0; int i=0;int j=0;

         while(j<arr.length) {
             while(i<=j && sum>k) {
              sum = sum - arr[i];
              i++;

          }
          if(sum==k)   {
              count++; //1
          }
             sum =sum + arr[j];//10
          j++; //3
         }

        System.out.println(count);
    }
}
