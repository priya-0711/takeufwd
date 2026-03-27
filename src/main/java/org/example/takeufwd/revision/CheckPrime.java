package org.example.takeufwd.revision;

public class CheckPrime {
    public static void main(String[] args) {
        int n=15; boolean flag =false;
        if(n==0 || n==1) System.out.println(false);
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                flag = true;
                break;
            }
        }
        if(flag==true)
            System.out.println(false);
        else
            System.out.println(true);

    }
}
