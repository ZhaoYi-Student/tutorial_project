package com.company.algorithm;

import com.company.pojo.ListNode;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 * <p>
 * example:
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 */
public class ReverseNodesInGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 0) {
            return head;
        }
        ListNode root = new ListNode(-1, head);
        ListNode result = null;

        boolean moveToRight = true;
        int size = 0;
        LinkedList<Integer> container = new LinkedList<>();

        while (root.next != null) {
            if (moveToRight) {
                root = new ListNode(root.next.val, null);
                if (size < k) {
                    container.addFirst(root.val);
                    size++;
                } else {
                    moveToRight = false;
                }
            } else {
                if (size == 0) {
                    moveToRight = true;
                } else {
                    result = new ListNode(container.remove(0), null);
                    result = result.next;
                    size--;
                }
            }
        }
        return result;
    }

    public ListNode reverseKGroup2(ListNode head, int k) {
        if (checkLength(head, k)) return head;
        int count = 0;
        ListNode current = head;
        ListNode next = null, prev = null;
        //usual linked list reversal

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        //the head of the original list will now be the tail of the reversed linked list of size k
        // and the next of that head is recursively assigned to what the function returns (prev)
        if (next != null) {
            head.next = reverseKGroup2(next, k);
        }
        return prev;
    }

    // a helper function to check if the size of the remaining list is less than k
// we need this to check whether we need to reverse the list or not
    public boolean checkLength(ListNode head, int k) {
        ListNode start = head;
        int size = 0;
        while (start != null) {
            start = start.next;
            size++;
        }
        return size < k;
    }
}
