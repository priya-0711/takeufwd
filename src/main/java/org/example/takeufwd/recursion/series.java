package org.example.takeufwd.recursion;

public class series {
    public static void main(String[] args) {
        //o/p: 1,2,3,4,.....n
        printNumberFrom1ToN(10);
        printNumberFromNTo1(10);
    }
    public static void printNumberFrom1ToN(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNumberFrom1ToN(n - 1);
        System.out.println(n);
    }
     public static void printNumberFromNTo1(int n) {
        //10,9,8,....1
         if (n == 1) {
             System.out.println(n);
             return;
         }
         System.out.println(n);
        printNumberFromNTo1(n-1);
    }
}
