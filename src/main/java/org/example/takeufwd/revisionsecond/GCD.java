package org.example.takeufwd.revisionsecond;

public class GCD {
    public static void main(String[] args) {
        /*
        Input: N1 = 9, N2 = 12

Output: 3
Explanation:
Factors of 9: 1, 3, 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3
Greatest common factor: 3 (GCD)
         */
        int  N1 = 20, N2 = 40; int max =1;
        for(int i=1;i<=N1;i++) {
            if(N1%i==0 && N2%i==0) {
                if(max<i) {
                    max =i;
                }
            }
        }
        System.out.println(max);

        while(N1>0 && N2 >0) {
            if(N1>N2) {
                N1 = N1-N2;
            } else {
                N2 = N2-N1;
            }
        }
        if(N1==0) System.out.println(N2);
        else System.out.println(N1);
    }
}
