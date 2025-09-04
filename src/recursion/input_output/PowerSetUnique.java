package recursion.input_output;

import java.util.HashSet;

public class PowerSetUnique {

    public static void main(String[] args) {
        String str = "aab";
        HashSet<String> hashSet = new HashSet<>();
        printSets(str, "", 0, str.length(), hashSet);
        System.out.println(hashSet);
    }

    private static void printSets(String str, String out, int index, int l, HashSet<String> hashSet) {
        if (index == l) {
            hashSet.add(out);
            return;
        }
        printSets(str, out + str.charAt(index), index + 1, l, hashSet);
        printSets(str, out, index + 1, l, hashSet);
    }
}
