package practice;

import java.util.ArrayList;
import java.util.List;

public class PowerSetArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        List<Integer> res = new ArrayList<>();
        printPowerSetOfArray(ar, 0, ar.length, res);
    }

    private static void printPowerSetOfArray(int[] ar, int i, int length, List<Integer> res) {
        if (length == i) {
            System.out.println(res);
            return;
        }
        res.add(ar[i]);
        printPowerSetOfArray(ar, i + 1, length, res);
        res.remove(res.size()-1);
        printPowerSetOfArray(ar, i + 1, length, res);
    }
}
