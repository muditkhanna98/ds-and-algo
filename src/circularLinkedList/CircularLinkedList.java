package circularLinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public void addLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("Empty LinkedList");
        } else {
            Node current = head;
            do {
                System.out.println(current.value);
                current = current.next;
            } while (current != head);
        }
    }
}
