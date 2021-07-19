package com.company;

import com.company.algorithm.*;
import com.company.pojo.ListNode;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //回文数
//        LongestPalindromicSubstring longestPalindromicSubstring
//                = new LongestPalindromicSubstring();
//        String result = longestPalindromicSubstring.longestPalindrome("babad");
//        System.out.println(result);
        //正则表达式匹配
//        RegularExpressionMatching regularExpressionMatching
//                = new RegularExpressionMatching();
//        boolean mississippi = regularExpressionMatching.isMatch("aaa", "ab*a*c*a");
//        System.out.println(mississippi);
//        MergeSortedLists.ListNode[] listNodes = new MergeSortedLists.ListNode[3];
//        listNodes[0] = new MergeSortedLists.ListNode(1, new MergeSortedLists.ListNode(1, new MergeSortedLists.ListNode(1, null)));
//        listNodes[1] = new MergeSortedLists.ListNode(1, new MergeSortedLists.ListNode(1, new MergeSortedLists.ListNode(4, null)));
//        listNodes[2] = new MergeSortedLists.ListNode(2, new MergeSortedLists.ListNode(6, null));
//        MergeSortedLists mergeSortedLists = new MergeSortedLists();
//        mergeSortedLists.mergeKLists(listNodes);
        //树的反向节点
//        ReverseNodesInGroup reverseNodesInGroup = new ReverseNodesInGroup();
//        reverseNodesInGroup.reverseKGroup2(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
        //连接所有单词的子串"ababaab"
        //["ab","ba","ba"]
        String s = "ababaab";
        String[] words = {"ab","ba","ba"};
        SubstringConcatenationWords substringConcatenationWords = new SubstringConcatenationWords();
        List<Integer> substring = substringConcatenationWords.findSubstring(s, words);
        System.out.println(substring);
    }
}
