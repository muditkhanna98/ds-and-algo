package linkedlist;

public class LinkedList {
    private Node head;

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
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
