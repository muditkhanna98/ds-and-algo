package linkedlist;

public class LinkedList {
    private Node head;

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = node;
        }
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("Empty LinkedList");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println("Value:" + current.value);
                current = current.next;
            }
        }
    }
}
