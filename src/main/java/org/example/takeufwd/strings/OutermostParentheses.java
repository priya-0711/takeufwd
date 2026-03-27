package org.example.takeufwd.strings;


/*
* Input: s = "( (()) )"
Output: "(())"
Explanation: The input string is a single primitive: "((()))".
Removing the outermost layer yields: "(())".
*/
public class OutermostParentheses {
    public static void main(String[] args) {
        System.out.println(removeOuterBrackets("()(()())(())"));
    }

    private static String removeOuterBrackets(String str) {
        int level =0;
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c == '(') {
                if(level > 0) {
                    sb.append(c);
                }
                level++;
            } else if (c == ')') {
                level--;
                if (level > 0) sb.append(c);

            }
        }
return sb.toString();
    }
}
