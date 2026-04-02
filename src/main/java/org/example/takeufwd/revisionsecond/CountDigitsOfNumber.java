package org.example.takeufwd.revisionsecond;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
       /* Input:N = 12345
        Output:5
        Explanation:  The number 12345 has 5 digits.*/
        int n = 12345;int count=0;
        String s = Integer.valueOf(n).toString();
        char[]ch = s.toCharArray();
        for(char c: ch) {
            if(Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
