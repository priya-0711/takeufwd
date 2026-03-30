package org.example.takeufwd.revisionsecond;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        /*Input:N = 2
        Output:True
        Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).*/
        int N=1; boolean flag= true;
        if(N==0 || N==1) {
            System.out.println("not prime");
            return;
        }
        for(int i=2;i<=Math.sqrt(N);i++) {
            if(N%i==0) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
