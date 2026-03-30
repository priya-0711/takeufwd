package org.example.takeufwd.revisionsecond;

public class FibonacciSeries {
    public static void main(String[] args) {
       /* Input: N = 5
        Output:  0 1 1 2 3 5
        Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)*/
        /*int N =5 ; int a = 0; int b=1; int c;
        System.out.println(a);
        System.out.println(b);
        for(int i =1;i<=N-1;i++) {
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }*/
        int N=5;
        for( int i=0;i<=N;i++) {
            System.out.println(printFibonacci(i));
        }
    }
    //recursion
    public static int printFibonacci(int N) {
        if (N <= 1)
           return N;
        return printFibonacci(N - 1) + printFibonacci(N - 2);

    }
}
