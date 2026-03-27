package org.example.takeufwd.strings;

public class ImplementAtoi {
    public static void main(String[] args) {
        String s ="012";
        System.out.println(atoi(s));
    }
    public static int atoi(String s) {
        /*if (s == null || s.isEmpty()) return 0;
        int sign = 1, result = 0;
        for (int i=0 ;i<=s.length()-1; i++) {
            if(s.charAt(i) == ' ') {
                continue;
            }
            if (i == s.length()) return 0;
            if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                sign = (s.charAt(i++) == '-') ? -1 : 1;
            }
            if(Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result = result * 10 + digit;
            }
        }
        return result * sign;*/

        if (s == null || s.isEmpty()) return 0;

        int sign = 1, result = 0, i = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i == s.length()) return 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            i++;

            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
        }

        return result * sign;

        }
}

