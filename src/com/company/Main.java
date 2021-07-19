package com.company;

import com.company.algorithm.LongestPalindromicSubstring;
import com.company.algorithm.MergeSortedLists;
import com.company.algorithm.RegularExpressionMatching;
import com.company.algorithm.ReverseNodesInGroup;
import com.company.pojo.ListNode;

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
        ReverseNodesInGroup reverseNodesInGroup = new ReverseNodesInGroup();
        reverseNodesInGroup.reverseKGroup2(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
    }
}
