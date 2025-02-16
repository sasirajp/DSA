package recursion.input_output;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationwithSpaces {

    public static void main(String[] args) {
        String str = "BBR";
        new PermutationwithSpaces().permutationWithSpaces(str, "", 0, str.length());
        System.out.println("*********");
        new PermutationwithSpaces().permutationWithSpacesSolution2(str, "B", 1, str.length());
    }

    private void permutationWithSpaces(String str, String out, int i, int length) {
        if (i == length - 1) {
            System.out.println(out + str.charAt(length - 1));
            return;
        }
        permutationWithSpaces(str, out + str.charAt(i) + " ", i + 1, length);
        permutationWithSpaces(str, out + str.charAt(i) + "", i + 1, length);
    }

    private void permutationWithSpacesSolution2(String str, String out, int i, int length) {
        if (i == length) {
            System.out.println(out);
            return;
        }
        permutationWithSpacesSolution2(str, out + " " + str.charAt(i), i + 1, length);
        permutationWithSpacesSolution2(str, out + "" + str.charAt(i), i + 1, length);
    }
}
