package com.expedia.interview.ex2;

public class Exercise2 {

    class SinglyLinkedListNode {
        SinglyLinkedListNode next;
    }


    /**
     * Note: If the list is empty, head will be null.
     * If the list contains a cycle, your function must return true.
     * If the list does not contain a cycle, it must return false.
     *
     * @param head
     * @return
     */
    boolean hasCycle(SinglyLinkedListNode head) {
        if (null == head) {
            return false;
        }
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        while (null != fast.next && null != fast.next.next) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}