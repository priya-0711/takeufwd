package org.example.takeufwd.linkedlist;

import java.util.Stack;

public class LLPalindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
    public static Boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode node = head;
        while(node!=null) {
           st.push(node.val);
           node = node.next;
        }
        ListNode lNode = head;
        while(lNode!=null) {
            if(lNode.val != st.pop()) {
                return false;
            }
            lNode = lNode.next;
        }
        return true;
    }
}
