package recursion.input_output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] ar = {1, 1, 2, 2, 3};
        int target = 3;
        Arrays.sort(ar);
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(ar, target, 0, ar.length, new ArrayList<>(), ans, 0);
        System.out.println(ans);
    }

    private static void combinationSum(int[] ar, int target, int i, int length, List<Integer> list, List<List<Integer>> ans, int sum) {
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (sum > target || i == length) return;

        sum += ar[i];
        list.add(ar[i]);
        combinationSum(ar, target, i + 1 , length, list, ans, sum);
        int nextIndex = i + 1;
        while (nextIndex < length && ar[i] == ar[nextIndex]) {
            nextIndex++;
        }
        sum -= list.remove(list.size() - 1);
        combinationSum(ar, target, nextIndex, length, list, ans, sum);
    }
}
