package org.example.takeufwd.recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
         str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(str);
        System.out.println(checkPalindrome(str)?"Palindrome":"Not Palindrome");
  //      System.out.println( checkStringPalindrome(finalStr,0,finalStr.length())?"Palindrome":"Not Palindrome");

    }
    public static boolean checkPalindrome(String str) {
        return checkStringPalindrome(str,0,str.length());
    }
    public static boolean checkStringPalindrome(String str,int start,int end) {
        if(start >= end) {
           return true;
       }
        if(str.charAt(start) != str.charAt(end-1)){
            return false;
        }
        return checkStringPalindrome(str,start+1,end-1);
    }




}
