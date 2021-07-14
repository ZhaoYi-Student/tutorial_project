package com.company;

import com.company.algorithm.LongestPalindromicSubstring;

public class Main {

    public static void main(String[] args) {
        //回文数
        LongestPalindromicSubstring longestPalindromicSubstring
                = new LongestPalindromicSubstring();
        String result = longestPalindromicSubstring.longestPalindrome("babad");
        System.out.println(result);
    }
}
