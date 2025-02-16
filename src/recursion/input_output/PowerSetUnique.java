package recursion.input_output;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PowerSetUnique {

    public static void main(String[] args) {
        String str = "aab";
        HashSet<String> hashSet = new HashSet<>();
        new PowerSetUnique().printSets(str, "", 0, str.length(), hashSet);
        System.out.println(hashSet);
    }

    private void printSets(String str, String out, int index, int l, HashSet<String> hashSet) {
        if (index == l) {
            hashSet.add(out);
            return;
        }
        printSets(str, out + str.charAt(index), index + 1, l, hashSet);
        printSets(str, out, index + 1, l, hashSet);
    }
}
