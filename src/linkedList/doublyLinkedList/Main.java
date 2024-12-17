package linkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtIndex(0, 1);
        list.insertAtIndex(2, 2);
        list.printValues();
    }
}
