package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLastUsingTail(10);
        list.addLast(20);
        list.addLast(40);
        list.addLast(50);

        list.deleteFromAnyPosition(40);


        list.printLinkedList();
    }
}
