package org.example.takeufwd.revision;

public class GcdHcfEx {
    public static void main(String[] args) {
        int a=5; int b=20;
       /* int maxGCD=0;
        for(int i=1;i<=n2;i++) {
            if(n2%i==0 && n1%i==0) {
                maxGCD=Math.max(maxGCD,i);

            }
        }
        System.out.println(maxGCD);*/

        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a - b;

            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
               b=b- a;

            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            System.out.println( b);
        }
        // If a is not 0,
        // return a as the GCD
        System.out.println( a);

    }
}
