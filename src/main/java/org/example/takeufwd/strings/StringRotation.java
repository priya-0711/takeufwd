package org.example.takeufwd.strings;

public class StringRotation {
    public static void main(String[] args) {
        String s = "aa", goal = "a";
        System.out.println(rotation(s,goal));
    }
    public static boolean rotation(String s,String goal) {
        if(s.length()!=goal.length()) return false;
        String substr = s+s;
        if (substr.contains(goal)) {
            return true;
        } else {
            return false;
        }
    }
}
