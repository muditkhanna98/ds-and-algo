package circularLinkedList;

public class CircularLinkedList {
    Node head;
    Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int value) {
        Node node = new Node(value);

        if (head == null || tail == null) {
            head = tail = node;
            return;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.tail.next = head;
    }

    public void deleteValue(int value) {
        if (head == tail && head.value == value) {
            head = tail = null;
            return;
        }
        Node current = head;

        if (head.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        //1->2->3->4
        while (current.next != null && current != this.tail) {
            if (current.next.value == value) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    public void printValues() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.println(current.value);
            current = current.next;
        } while (current != this.head);
    }


}
