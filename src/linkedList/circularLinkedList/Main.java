package linkedList.circularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(100);


        list.josephusProblem();
    }
}
