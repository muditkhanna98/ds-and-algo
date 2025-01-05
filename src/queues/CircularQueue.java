package queues;

public class CircularQueue {
    private static final int MAX_SIZE = 101;
    private int[] arr = new int[MAX_SIZE];
    private int front = 0;
    private int rear = -1;
    private int currentSize = 0;

    private boolean isFull() {
        return this.currentSize == this.MAX_SIZE;
    }

    private boolean isEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % this.MAX_SIZE;
        arr[rear] = item;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[front];
        front = (front + 1) % this.MAX_SIZE;
        currentSize--;
        return element;
    }
}
