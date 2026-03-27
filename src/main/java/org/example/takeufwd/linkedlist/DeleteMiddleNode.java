package org.example.takeufwd.linkedlist;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
       /* head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);*/
         ListNode node = deleteMiddle(head);
        ListNode lNode = node;
        while(lNode!=null) {
            System.out.print(lNode.val+"->");
            lNode = lNode.next;
        }
        System.out.println("NULL");

    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null) {
          return head;
        }
        ListNode node = head; int size=0;
        while(node!=null) {
            size++;
            node = node.next;
        }
        if(size==1) return null;
        int midEle = size/2;
        ListNode listNode = head;

        while(listNode != null) {
             midEle--;
            if(midEle==0) {
               ListNode mid = listNode.next;
                listNode.next = listNode.next.next ;
                break;
            }
            listNode = listNode.next;
        }
        return head;
    }
}
