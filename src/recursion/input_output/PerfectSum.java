package recursion.input_output;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerfectSum {
    public static void main(String[] args) {
        int ar[] = {5, 2, 3, 10, 6, 8};
        int target = 10;
        int count = new PerfectSum().findCount(ar, target, 0, ar.length, 0);
        System.out.println(count);
    }

    private int findCount(int[] ar, int target, int i, int length, int sum) {
        if (i == length) {
            if (sum == target)
                return 1;
            return 0;
        } else {
            return findCount(ar, target, i + 1, length, sum + ar[i])
             + findCount(ar, target, i + 1, length, sum);
        }
    }


}
