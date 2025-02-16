package recursion;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(3, 2, 1, 5, 7, 44, 23, 11, 10));
        System.out.println(stack);
        sort(stack, stack.size());
        System.out.println(stack);
    }

    private static void sort(Stack<Integer> stack, int length) {
        if (length == 1)
            return;
        int value = stack.pop();
        sort(stack, length - 1);
        insertValue2(stack, value);
    }

    private static void insertValue2(Stack<Integer> stack, int value) {
        if (stack.size() == 0 || stack.peek() < value) {
            stack.push(value);
            return;
        }
        int val = stack.pop();
        insertValue2(stack, value);
        stack.push(val);
    }

}
