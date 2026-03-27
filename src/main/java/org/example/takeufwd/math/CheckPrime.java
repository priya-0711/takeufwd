package org.example.takeufwd.math;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(11));
    }
    public static boolean checkPrime(int n) {
        //optimal approach
        if(n<=1)  return false;
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0){
                flag=false;
            }
        }
      return flag;
    }
}
