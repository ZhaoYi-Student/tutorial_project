package com.company.algorithm;

/**
 * 取最长的回文数字符串
 */
public class LongestPalindromicSubstring {

    private int startIndex;
    private int resultSize;

    /**
     * If length of old String is less than one, return directly
     * Or
     * Loop old String
     * - palindromicQuery(String s, int start, int end)
     * Finally intercept the string and return the result
     * -- palindromicQuery(s, i, i) 'aba'
     * -- palindromicQuery(s, i, i + 1) 'cbb'
     *
     * @param s old string
     * @return java.lang.String
     */
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) return s;
        for (int i = 0; i < len; i++) {
            palindromicQuery(s, i, i);
            palindromicQuery(s, i, i + 1);
        }
        return s.substring(startIndex, startIndex + resultSize);
    }

    /**
     * Query the number of palindromes through two indexes "left and right"
     * Compare from the middle to the two ends respectively
     *
     * @param s     old String
     * @param left  left index
     * @param right right index
     */
    private void palindromicQuery(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        int size;
        if ((size = right - left - 1) > resultSize) {
            resultSize = size;
            startIndex = left + 1;
        }
    }
}
