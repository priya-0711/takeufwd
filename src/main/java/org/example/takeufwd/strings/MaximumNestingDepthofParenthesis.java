package org.example.takeufwd.strings;

public class MaximumNestingDepthofParenthesis {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        maxDepth(s);
    }
    public static void maxDepth(String s) {
        int count=0; int ans =0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') {
                count++;
            } else if (s.charAt(i)==')') {
                count--;
            }
            ans = Math.max(ans,count);
        }
        System.out.println(ans);
    }
}
