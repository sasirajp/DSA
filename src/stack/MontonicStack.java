package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class MontonicStack {
    public static void main(String[] args) {
        int[] ar = {2, 1, 2, 4, 3};
        int[] ans= new int[ar.length];
        Arrays.fill(ans, -1);
//        [4, 2, 4, -1, -1]
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ar.length; i++) {
            while (!stack.isEmpty() && ar[i] > ar[stack.peek()]) {
                int index = stack.pop();
                ans[index] = ar[i];
            }
            stack.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
