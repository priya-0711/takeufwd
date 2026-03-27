package org.example.takeufwd.linkedlist;

public class MiddleOfLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
         ListNode node = middleofLL(head);
         while(node!=null) {
             System.out.print(node.val+"->");
             node = node.next;
         }
        System.out.println("NULL");

    }
    // brute force approach

    public static ListNode middleofLL(ListNode head) {
        int size=0;
        ListNode currNode = head;
        while(currNode!=null){
            size++;
            currNode = currNode.next;
        }
        int middleEle = size/2+1;
        ListNode midNode = head;
        while(midNode!=null) {
            middleEle = middleEle-1;
            if(middleEle==0) {
                break;
            }
            midNode = midNode.next;
        }
        return midNode;
    }
}
