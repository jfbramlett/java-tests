package com.bramlettny.alpha.test1;

/**
 * Coding task 1. Longest substring without repeating characters.
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: Theanswer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 */

public class Test1 {

    /**
     * Finds the length of the longest substring without repeating characters in the given input
     *
     * @param input String The input string we are finding the longest substring for
     * @return int The length of the longest substring without repeating characters
     */
    public static int findLongestSubstring(String input) {
        String longest = "";
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int idx = tmp.indexOf(String.valueOf(input.charAt(i)));
            if (idx == -1) {
                tmp.append(input.charAt(i));
            } else {
                if (longest.length() < tmp.length()) {
                    longest = tmp.toString();
                }
                tmp = new StringBuilder(tmp.substring(idx));
            }
        }
        if (longest.length() < tmp.length()) {
            longest = tmp.toString();
        }

        System.out.println("Longest string: " + longest);
        return longest.length();
    }
}
