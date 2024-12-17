package linkedList.doublyLinkedList;

public class DoublyLinkedList {
    Node head;

    public void insertAtIndex(int index, int value) {
        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node iter = head;
            for (int i = 0; i < index - 1; i++) {
                iter = iter.next;
            }

            Node A = iter;
            Node B = iter.next;

            A.next = newNode;
            if (B != null) {
                B.prev = newNode;
            }

            newNode.next = B;
            newNode.prev = A;
        }
    }

    void deleteNode(int value) {
        Node targetNode = head;
        while (targetNode != null && targetNode.value != value) {
            targetNode = targetNode.next;
        }

        if (targetNode == null)
            return;

        // Update A and B
        Node A = targetNode.prev;
        Node B = targetNode.next;

        // A could be null if target is head
        if (A != null) {
            A.next = B;
        }

        // B could be null if target is tail
        if (B != null) {
            B.prev = A;
        }

        if (targetNode == head) {
            head = B;
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
