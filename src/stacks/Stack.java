package stacks;

public class Stack {
    private final int MAX_SIZE = 101;
    private int[] arr = new int[MAX_SIZE];
    private int top = -1;

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            top++;
            arr[top] = value;
            System.out.println("Pushed " + value + " to the top of the stack");
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (top >= 0) {
            int item = arr[top];
            top--;
            System.out.println("Popped " + item + " from the stack");
            return item;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
}
