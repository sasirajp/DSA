package recursion;

import java.util.Arrays;
import java.util.Stack;

public class DeleteMiddleInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(stack);
        int middleIndex = (stack.size() / 2) + 1;
        System.out.println(middleIndex - 1);
        removeMiddle(stack, middleIndex);
        System.out.println(stack);
    }

    private static void removeMiddle(Stack<Integer> stack, int middleIndex) {
        if (1 == middleIndex) {
            stack.pop();
            return;
        }
        int val = stack.pop();
        removeMiddle(stack, middleIndex - 1);
        stack.push(val);
    }

}
