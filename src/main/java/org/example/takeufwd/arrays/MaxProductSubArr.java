package org.example.takeufwd.arrays;

public class MaxProductSubArr {
    public static void main(String[] args) {
        int arr[] = new int[]{-5, 0, -2};
        int productPrefix =1 ; int max= 0;
        int productSuffix =1;
        for(int i=0;i<arr.length;i++) {
            if(productSuffix == 0) productSuffix =1;
            if( productPrefix ==0) productPrefix =1;
            productPrefix = productPrefix * arr[i];
            productSuffix = productSuffix * arr[arr.length -i - 1] ;
            max  = Math.max(max , Math.max(productPrefix,productSuffix));

        }
        System.out.println(max);
    }
}
