package recursion.input_output;

public class PerfectSum {
    public static void main(String[] args) {
        int[] ar = {5, 2, 3, 10, 6, 8};
        int target = 10;
        int count = findCount(ar, target, 0, ar.length, 0);
        System.out.println(count);
    }

    private static int findCount(int[] ar, int target, int i, int length, int sum) {
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
