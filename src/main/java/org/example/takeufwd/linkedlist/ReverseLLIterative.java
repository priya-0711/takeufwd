package org.example.takeufwd.linkedlist;

public class ReverseLLIterative {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
        ListNode node = reverseList(head);
        ListNode currNode = node;
        while(currNode!=null) {
            System.out.print(currNode.val + "->");
            currNode =currNode.next;
        }
        System.out.println("NULL");
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
         while(curr!=null) {
             next = curr.next;
             curr.next = prev;
             prev= curr;
             curr= next;
         }
         return prev;
    }
}
