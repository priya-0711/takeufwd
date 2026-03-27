package org.example.takeufwd.math;

public class CountDigitsEx {
    public static void main(String[] args) {
        System.out.println(countDigit(11211)); //11211=no of digits =5
    }
    public static int countDigit(int n) {
        int count = 0 ;
        if(n==0) return 1;
        while(n!=0) {
            int res = n % 10; //1 //2 //1
            count++;
            n = n/10;  //12
        }
        return count;
    }
}
