package org.example.takeufwd.recursion;

import java.util.*;

public class StringSubsetsExample {
    public static List<String> uniqueSet = new ArrayList<>();
        public static void main(String[] args) {
            String input = "aac";
        //    generateALLUniqueSubsets(input, "", 0);
            /*for (String s: uniqueSet)
                System.out.println(s);*/
            char[] ch = input.toCharArray();
            Arrays.sort(ch);
            generateALLUniqueSubsetsOptimal(ch, new StringBuilder(), 0,uniqueSet);
            for (String s: uniqueSet)
                System.out.println(s);
        }
        public static void generateALLUniqueSubsets(String input,String output,int index) {
            if(input.length()==index){
                uniqueSet.add(output);
                return;
            }
            //exclude
            generateALLUniqueSubsets(input,output,index+1);
            //include
            generateALLUniqueSubsets(input,output+input.charAt(index),index+1);
        }

        public static void generateALLUniqueSubsetsOptimal(char[]input,StringBuilder output,int index,List<String>uniqueSet) {
            uniqueSet.add(output.toString());

            for (int i = index; i < input.length; i++) {
                // Skip duplicate characters at the same decision level
                if (i > index && input[i] == input[i - 1]) {
                    continue;
                }

                // Choose character
                output.append(input[i]);

                // Recurse with next index
                generateALLUniqueSubsetsOptimal(input, output,i + 1, uniqueSet);

                // Backtrack (remove last char)
                output.deleteCharAt(output.length() - 1);
            }

        }
}
