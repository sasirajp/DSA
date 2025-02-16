package recursion.input_output;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        new PowerSet().printSets(str, "", 0, str.length());
        var ans = new PowerSet().returnSets("abc", "", 0, str.length());
        System.out.println("*****************\n" + ans);
    }

    private void printSets(String str, String out, int index, int l) {
        if (index == l) {
            System.out.println(out);
            return;
        }
        printSets(str, out + str.charAt(index), index + 1, l);
        printSets(str, out, index + 1, l);
    }

    //    Solution 2 with returning values
    private List<String> returnSets(String str, String out, int index, int l) {
        if (index == l) {
            return new ArrayList<String>(Collections.singletonList(out));
        }
        List<String> includeList = returnSets(str, out + str.charAt(index), index + 1, l);
        List<String> excludeList = returnSets(str, out, index + 1, l);
        includeList.addAll(excludeList);
        return includeList;
    }


}
