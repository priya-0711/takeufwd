package org.example.takeufwd.recursion;

public class PalindromeChecker {

    /**
     * TODO: Implement this method
     *
     * Given a string, return true if it is a palindrome, false otherwise.
     * A string is palindrome if the reverse of the string is the same as the original.
     *
     * Examples:
     * - "ABCDCBA" -> true
     * - "TAKE U FORWARD" -> false
     */
    public static boolean isPalindrome(String str) {
        // ---------- STUDENT CODE STARTS HERE ----------

        // Replace this line with your logic
        return false;

        // ---------- STUDENT CODE ENDS HERE ----------
    }

    // Test harness
    public static void main(String[] args) {
        String[] inputs = {
                "ABCDCBA",           // Example 1
                "TAKE U FORWARD",    // Example 2
                "",                  // Edge: empty string
                "A",                 // Edge: single character
                "AA",                // Edge: two same characters
                "AB",                // Edge: two different characters
                "abba",              // Even-length palindrome
                "abcba",             // Odd-length palindrome
                "abcde",             // Non-palindrome
                "racecar",           // Classic palindrome
                "RaceCar",           // Case-sensitive check
                "noon",              // Palindrome word
                "hello",             // Non-palindrome word
                "1221",              // Numeric palindrome
                "12321"              // Numeric palindrome
        };

        boolean[] expected = {
                true,   // "ABCDCBA"
                false,  // "TAKE U FORWARD"
                true,   // ""
                true,   // "A"
                true,   // "AA"
                false,  // "AB"
                true,   // "abba"
                true,   // "abcba"
                false,  // "abcde"
                true,   // "racecar"
                false,  // "RaceCar" (case-sensitive)
                true,   // "noon"
                false,  // "hello"
                true,   // "1221"
                true    // "12321"
        };

        int passed = 0;
        for (int i = 0; i < inputs.length; i++) {
            boolean result = isPalindrome(inputs[i]);
            if (result == expected[i]) {
                System.out.println("PASSED ✅ | Input: \"" + inputs[i] +
                        "\" | Expected: " + expected[i] +
                        " | Actual: " + result);
                passed++;
            } else {
                System.out.println("FAILED ❌ | Input: \"" + inputs[i] +
                        "\" | Expected: " + expected[i] +
                        " | Actual: " + result);
            }
        }

        System.out.println("\nSummary: " + passed + " / " + inputs.length + " tests passed.");
    }
}

