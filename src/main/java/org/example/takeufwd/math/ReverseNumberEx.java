package org.example.takeufwd.math;

public class ReverseNumberEx {
    public static void main(String[] args) {
        System.out.println(reverseNumber(-123));
    }
    public static int reverseNumber(int x) {
       int rev =0;
        while(x!=0) {
            int res = x % 10;
            x = x/10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && res > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && res < -8)) {
                return 0;
            }
           rev = rev*10 + res;

        }
        return rev;
    }
}
