package linkedList.doublyLinkedList;

public class DoublyLinkedList {
    Node head;

    public void insertAtIndex(int index, int value) {


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
