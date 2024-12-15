package circularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(50);

        list.printValues();
    }
}
