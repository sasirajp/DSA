package recursion.input_output;

public class LetterCasePermutation {

    public static void main(String[] args) {
        String str = "A1b2";
        new LetterCasePermutation().letterCasePermutation(str, "", 0, str.length());
    }

    private void letterCasePermutation(String str, String out, int i, int length) {
        if (i == length) {
            System.out.println(out);
        } else {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letterCasePermutation(str, out + Character.toLowerCase(ch), i + 1, length);
                letterCasePermutation(str, out + Character.toUpperCase(ch), i + 1, length);
            } else {
                letterCasePermutation(str, out + ch, i + 1, length);
            }
        }
    }
}
