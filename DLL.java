package Com.Kavita.SingleLinkedList.DoublyLinkedList;

import Com.Kavita.SingleLinkedList.LL;

public class DLL {
    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;

        }
        System.out.println("START");
    }


    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head==null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next !=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        Node temp = head;
        int i = 0;

        // Move temp to index-1
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (temp.next == null) {
            insertLast(val);  // if index == size
            return;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int value) {
            this.val = value;
        }

        Node(int value, Node next, Node prev) {
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
