package com.company.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a string s and an array of strings words of the same length.
 * Return all starting indices of substring(s) in s that is a concatenation of each word in words exactly once,
 * in any order, and without any intervening characters.
 * <p>
 * You can return the answer in any order.
 * <p>
 * example1:
 * Input: s = "barfoothefoobarman", words = ["foo","bar"]
 * Output: [0,9]
 * Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
 * The output order does not matter, returning [9,0] is fine too.
 */
public class SubstringConcatenationWords {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) {
            return result;
        }
        int wordLength = words[0].length();
        final int matchLength = wordLength * words.length;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char[] wordChars = new char[matchLength];
            if (i + matchLength > chars.length) break;
            System.arraycopy(chars, i, wordChars, 0, wordChars.length);
            String wordStr = new String(wordChars);
            if (contain(wordStr, words))
                result.add(i);
        }

        return result;
    }

    private boolean contain(String wordStr, String[] words) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < wordStr.length(); i += words[0].length()) {
            if (i + words[0].length() > wordStr.length()) break;
            arrayList.add(wordStr.substring(i, i + words[0].length()));
        }
        for (String word : words) {
            if (!arrayList.contains(word)) {
                return false;
            } else {
                arrayList.remove(word);
            }
        }
        return true;
    }
}
