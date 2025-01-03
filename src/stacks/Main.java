package stacks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        int[] result = stack.nextGreaterElement(new int[]{4, 5, 2, 25});
        System.out.println(Arrays.toString(result));
    }
}
