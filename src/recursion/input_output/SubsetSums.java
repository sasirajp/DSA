package recursion.input_output;

import java.util.ArrayList;
import java.util.List;

public class SubsetSums {
    public static void main(String[] args) {
        int[] ar = {1,2,1};
        List<Integer> ans = new ArrayList<>();
        subsetSums(ar, 0, ar.length, ans, 0);
        System.out.println(ans);
    }

    private static void subsetSums(int[] ar, int index, int length, List<Integer> ans, int sum) {
        if (index == length) {
            ans.add(sum);
            return;
        }
        subsetSums(ar, index + 1, length, ans, sum + ar[index]);
        subsetSums(ar, index + 1, length, ans, sum );
    }
}
