package org.example.takeufwd.recursion;

public class FActorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
         //5!=5*4*3*2*1
        if(n==0 || n==1) return 1;
        return n* factorial(n-1);


    }
}
