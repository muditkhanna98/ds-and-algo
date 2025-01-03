package stacks;


import java.util.ArrayDeque;
import java.util.Deque;

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

    public int[] nextGreaterElement(int[] arr) {
        //[4 5 2 25]
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        return result;
    }

    public int[] nextSmallestElement(int[] arr) {
        //[4, 2, 14, 7, 1, 9]
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

}
