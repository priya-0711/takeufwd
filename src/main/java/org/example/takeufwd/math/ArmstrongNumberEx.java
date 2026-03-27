package org.example.takeufwd.math;

public class ArmstrongNumberEx {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(371));
    }
    public static boolean checkArmstrong(int n) {
        double sum =0; int num2 =n;
        int count = String.valueOf(n).length();
        while (n>0) {
            int lastDigit = n % 10;
            sum = sum + Math.pow(lastDigit,count);
            n = n/10;
        }
        if(sum==num2)
            return true;
        else
            return false;
    }
}
