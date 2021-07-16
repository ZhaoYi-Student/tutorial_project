package com.company.algorithm;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 */
public class MergeSortedLists {

    private final LinkedList<Integer> result = new LinkedList<>();

//    public ListNode mergeKLists(ListNode[] lists) {
//        for (ListNode list : lists) {
//            if (list == null) {
//                continue;
//            }
//            result.add(list.val);
//            while (list.next != null) {
//                list = list.next;
//                result.add(list.val);
//            }
//        }
//        return sorted();
//    }

    private ListNode sorted() {
        List<Integer> collect = result.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        return add(collect);
    }

    private ListNode add(List<Integer> collect) {
        if (collect.isEmpty()) {
            return null;
        } else {
            Integer val = collect.remove(0);
            return new ListNode(val, add(collect));
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergetwosll(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null){
            return l1 != null ? l1 : l2;
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode c1 = l1;
        ListNode c2 = l2;

        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                prev.next = c1;
                c1 = c1.next;
            }
            else{
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }

        prev.next = c1 != null ? c1 : c2;

        return dummy.next;

    }

    public static ListNode mergeKListshelper(ListNode[] lists, int si, int ei){
        if(si == ei){
            return lists[si];
        }

        int mid = (si + ei) / 2;

        ListNode l1 = mergeKListshelper(lists, si, mid);
        ListNode l2 = mergeKListshelper(lists, mid + 1, ei);

        return mergetwosll(l1, l2);

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }

        return mergeKListshelper(lists, 0, lists.length - 1);
    }
}
