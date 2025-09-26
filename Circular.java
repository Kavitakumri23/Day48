package Com.Kavita.SingleLinkedList.DoublyLinkedList;


public class Circular{
    private Node head;
    private Node tail;

    // Insert at end
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;  // circular link
            return;
        }

        tail.next = node;
        node.next = head;  // circle
        tail = node;
    }

    // Delete a node with value
    public void delete(int val) {
        Node node = head;

        if (node == null) return;

        // If only 1 element
        if (node.val == val && node == tail) {
            head = null;
            tail = null;
            return;
        }

        // If deleting head
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        // Traverse
        do {
            Node nextNode = node.next;
            if (nextNode.val == val) {
                node.next = nextNode.next;
                // if deleting tail
                if (nextNode == tail) {
                    tail = node;
                }
                break;
            }
            node = node.next;
        } while (node != head);
    }

    // Display the list
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Test main

}

