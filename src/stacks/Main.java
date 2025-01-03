package stacks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int[] resultSmallest = stack.nextSmallestElement(new int[]{4, 2, 14, 7, 1, 9});

        System.out.println(Arrays.toString(resultSmallest));
    }
}
