package org.example.takeufwd.math;

import java.util.ArrayList;
import java.util.List;

public class AllDivisorOfNum {
    public static void main(String[] args) {
        System.out.println(allDivisor(36));
        System.out.println(allDivisorOptimal(36));
    }
    //brute force approach
    public static int[] allDivisor(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(n%i==0){
                list.add(i);
            }
        }
      return list.stream().mapToInt(Integer::intValue).toArray();

    }
    //optimal approach
    public static int[] allDivisorOptimal(int n) {
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
               divisors.add(i);
               if(i!=n/i) {
                   divisors.add(n/i);
               }
            }
        }
        System.out.println(divisors);
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }
}
