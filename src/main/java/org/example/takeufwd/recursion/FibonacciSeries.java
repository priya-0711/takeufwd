package org.example.takeufwd.recursion;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
       /* int []fib = new int[n+1];
        fib[0] =0;
        fib[1] =1;
        for(int i=2;i<=n;i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }*/
        if (n <= 1) {
            return n;
        }
        int c = fibonacci(n - 1) + fibonacci(n - 2);
        return c;
    }
}
