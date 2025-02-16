package recursion.input_output;

import java.util.HashSet;

public class CaseChangePermutation {

    public static void main(String[] args) {
        String str = "ab";
        new CaseChangePermutation().caseChangePermutation(str, "", 0, str.length());
    }

    private void caseChangePermutation(String str, String out, int i, int length) {
        if (i == length) {
            System.out.println(out);
        } else {
            caseChangePermutation(str,  out + Character.toUpperCase(str.charAt(i)), i + 1, length);
            caseChangePermutation(str,  out + Character.toLowerCase(str.charAt(i)), i + 1, length);
        }
    }
}
