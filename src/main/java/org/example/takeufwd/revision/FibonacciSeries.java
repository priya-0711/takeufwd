package org.example.takeufwd.revision;

public class FibonacciSeries {
    public static void main(String[] args) {
        int N=6; int a=0;int b=1;
        /*System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=N-1;i++) {
            int c= a+b;
            System.out.println(c);
            a=b;
            b=c;*/
        System.out.println(fibonacci(N));

        }
        public static int fibonacci(int N) {
        if(N<=1) return N;
        return fibonacci(N-1) +fibonacci(N-2);  //4,3  //3,2 //1,0 //0
    }
}
