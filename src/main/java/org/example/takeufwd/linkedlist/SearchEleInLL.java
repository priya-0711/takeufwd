package org.example.takeufwd.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}

public class SearchEleInLL {
    public static void main(String[] args) {
        int key =42;
        ListNode head = new ListNode(42);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(searchKey(head,key));
    }
    public static boolean searchKey(ListNode head, int key) {
        if(head == null) {
            return false;
        }
         ListNode currNode = head;
         while(currNode != null) {
             if(currNode.val == key) {
                 return true;
             }
             currNode = currNode.next;
         }
         return false;
    }
}
