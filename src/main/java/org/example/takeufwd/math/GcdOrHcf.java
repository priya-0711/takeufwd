package org.example.takeufwd.math;

public class GcdOrHcf {
    public static void main(String[] args) {
        System.out.println(maxGcd(9, 12));
        System.out.println(maxGcdOptimal(20,15));
    }
    //brute force approach
    public static int maxGcd(int n1, int n2) {
        int maxGcd = 1;
        for (int i = 1; i <= 9; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (maxGcd < i) {
                    maxGcd = i;
                }
            }
        }
        return maxGcd;
    }
        //optimal approach
    public static int maxGcdOptimal(int n1,int n2){ //9,12
        while(n1>0 && n2 >0) { //n1=9,n2=3
            if(n1>n2) {
                n1 = n1 % n2; //n1=0
            } else {
                n2 = n2%n1; //3
            }
        }
        if(n1==0) {
            return n2;
        } else {
            return n1;
        }
    }

}