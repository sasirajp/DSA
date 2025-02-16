package recursion;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(stack);
        reverseStack(stack, stack.size());
        System.out.println(stack);
    }

    private static void reverseStack(Stack<Integer> stack, int size) {
        if (size == 0) return;
        int val = stack.pop();
        reverseStack(stack, size - 1);
        insertValAtZeroIndex(stack, val);
    }

    private static void insertValAtZeroIndex(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int value = stack.pop();
        insertValAtZeroIndex(stack, val);
        stack.push(value);
    }
}
