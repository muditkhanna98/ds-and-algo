package stacks;


public class Stack {
    // stack library has issues
    // in java use ArrayDeque interface to create a stack.
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

    public int peek() {
        if (top >= 0) {
            return arr[top];
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= MAX_SIZE;
    }

    public void convertDecimalToBinary(int value) {
        while (value > 0) {
            int remainder = value % 2;
            push(remainder);
            value = value / 2;
        }

        if (isEmpty()) {
            System.out.println("0");
        }

        while (!isEmpty()) {
            System.out.println(pop());
        }
    }

}
