package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(40);
        list.addLast(50);


        list.addAfterKthPosition(100, 2);
        list.printLinkedList();
    }
}
