package recursion;

import java.util.Arrays;
import java.util.Stack;

public class CheckIfStringisPalindromOrNot {
    public static void main(String[] args) {
        String str = "abcd,dcbe";
        var ans = new CheckIfStringisPalindromOrNot().isPalindrome(str);
        System.out.println(ans);
    }

    public boolean isPalindrome(String s) {
        return func(new StringBuilder(s), 0, s.length() - 1);
    }

    private boolean func(StringBuilder s, int i, int l) {
        if (i >= l) {
            return true;
        }
        if (!Character.isLetterOrDigit(s.charAt(i))) {
            return func(s, i + 1, l);
        }
        if (!Character.isLetterOrDigit(s.charAt(l))) {
            return func(s, i, l - 1);
        }
        if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(l))) {
            return func(s, i + 1, l - 1);
        }
        return false;
    }

}
