package org.example.takeufwd.linkedlist;

class Node {
     String data;
     Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}


public class InsertDeletePrintFunctionsInLL {
    Node head;
    public static void main(String[] args) {
        InsertDeletePrintFunctionsInLL ll = new InsertDeletePrintFunctionsInLL();
        ll.addFirst("4");
        ll.addFirst("3");
        ll.addFirst("2");
        ll.addFirst("1");
        ll.printList();
        System.out.println();
        ll.getSize();
        ll.addLast("5");
        System.out.println();
        ll.printList();
        System.out.println();
        ll.getSize();
        ll.deleteFirst();
        System.out.println();
        ll.printList();
        System.out.println();
        ll.getSize();
        ll.deleteLast();
        System.out.println();
        ll.printList();
        System.out.println();
        ll.getSize();

    }

    // addFirst
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if(head==null) {
            System.out.println("list is empty");
            return;
        }
        if(head.next == null) {
            head=null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }

    //print list
    public void printList() {
        if(head == null) {
            System.out.println("list is empty,nothing to print.");;
            return;
        }
        Node currNode = head;

        while(currNode != null) {
            System.out.print(currNode.data +"->");

            currNode = currNode.next;
        }
        System.out.print("NULL");


    }
    public void getSize() {
        int size=0;
        if(head == null) {
                return;
        }
        Node currNode = head;
        while(currNode != null) {
                size++;
                currNode = currNode.next;
        }
        System.out.println(size);

    }
}
