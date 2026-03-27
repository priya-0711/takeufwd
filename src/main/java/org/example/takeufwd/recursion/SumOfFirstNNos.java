package org.example.takeufwd.recursion;

public class SumOfFirstNNos {
    public static void main(String[] args) {
        System.out.println(sumOfN(4));
    }
    public static int sumOfN(int n) {
       if(n==0)  return 0;
       return n + sumOfN(n-1);
    }
}
