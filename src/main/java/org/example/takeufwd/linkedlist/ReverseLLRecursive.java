package org.example.takeufwd.linkedlist;

public class ReverseLLRecursive {
    public static void main(String[] args) {
        Node head = new Node("1");
        head.next = new Node("2");
        head.next.next = new Node("3");
        head.next.next.next = new Node("4");
        Node node = reverseListRecursive(head);
        while(node!=null) {
            System.out.print(node.data+ "->");
            node= node.next;
        }
        System.out.println("NULL");
    }
    public static Node reverseListRecursive(Node head) {
        if(head==null || head.next ==null) {
            return head;
        }
        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;


    }
}
