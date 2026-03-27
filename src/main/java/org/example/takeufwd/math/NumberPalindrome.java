package org.example.takeufwd.math;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(numberPalindrome(120));
    }
    public static boolean numberPalindrome(int n) {
        int sum =0;
        int re = n;
        while(n!=0) {
            int res = n%10;
            n = n/10;
            sum = sum*10 + res;
        }
        if(sum==re){
            return true;
        } else {
           return false;
        }
    }
}
