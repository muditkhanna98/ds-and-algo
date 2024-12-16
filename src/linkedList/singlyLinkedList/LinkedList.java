package linkedList.singlyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

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

    public void addLastUsingTail(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addAfterKthPosition(int value, int k) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {
            Node current = head;

            //10->20->40->50
            for (int i = 1; i < k; i++) {
                current = current.next;
            }

            node.next = current.next;
            current.next = node;

        }
    }

    public void deleteFromFront(int value) {
        if (head.value == value) {
            Node targetNode = head;
            head = targetNode.next;
        }
    }

    public void deleteFromAnyPosition(int value) {
        //1->2->3->4
        if (head.value == value) {
            Node targetNode = head;
            head = targetNode.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
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
