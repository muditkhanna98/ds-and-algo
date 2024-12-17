package linkedList.doublyLinkedList;

public class DoublyLinkedList {
    Node head;

    public void insertAtIndex(int index, int value) {
        Node node = new Node(value);

        if (index == 0) {
            node.next = head;
            if (head != null) {
                head.prev = node;
            }
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                Node b = current.next;

                current.next = node;

                if (b != null) {
                    b.prev = node;
                }

                node.next = b;
                node.prev = current;
            }
        }
    }

    public void printValues() {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }

    }
}
