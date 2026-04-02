package org.example.takeufwd.revisionsecond;

public class ValidPalindromeUsing2Pointer {
    public static void main(String[] args) {
        String str = "A man a plan a canal:panama";
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0,j=str.length()-1;
        while(i<j) {
            if(str.charAt(i)==str.charAt(j)) {
                i++;
                j--;
            }
            else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
