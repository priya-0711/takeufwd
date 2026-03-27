package org.example.takeufwd.strings;

public class CountSubstring {
    public static void main(String[] args) {
        String str = "abcab";
        int count = str.length() * (str.length()+1) /2;
        System.out.println(count);
    }
}
