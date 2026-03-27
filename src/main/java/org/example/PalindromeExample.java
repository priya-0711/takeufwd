package org.example;

public class PalindromeExample {
    public static void main(String[] args) {
        // palindrome("abcdefg") === false
        // palindrome("abcba") === true
        System.out.println(palindrome("abcdcba"));
    }
    public static boolean palindrome(String str) {
        for(int i=0; i< str.length()/2;i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
                return true;
    }
}
