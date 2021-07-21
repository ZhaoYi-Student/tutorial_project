package com.company.algorithm;

import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 * Example 2:
 * <p>
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 * Example 3:
 * <p>
 * Input: s = ""
 * Output: 0
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int open=0;
        int close=0;
        int maxLen=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(') open++;
            else close++;

            if(open==close){
                maxLen=Math.max(maxLen,open+close);
            }
            else if(close>open){
                open=close=0;
            }
        }

        open=close=0;

        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);

            if(c=='(') open++;
            else close++;

            if(open==close){
                maxLen=Math.max(maxLen,open+close);
            }
            else if(close<open){
                open=close=0;
            }
        }
        return maxLen;
    }

}
