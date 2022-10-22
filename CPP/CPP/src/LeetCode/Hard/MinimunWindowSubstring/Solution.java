package LeetCode.Hard.MinimunWindowSubstring;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t of lengths m and n respectively,
return the minimum window substring of s such that every character in t
(including duplicates) is included in the window. If there is no such
substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 */
public class Solution {
    public String minWindow(String s, String t) {
        // If there are more characters to find than elements on source (s) there are no valid substrings
        if (t.length() > s.length()) return "";



        return "";

    }

    public static void main(String[] args) {

    }
}
