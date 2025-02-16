package recursion.input_output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSetList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        new PowerSetList().printLists(list, new ArrayList<>(), 0, list.size());
    }

    private void printLists(List<Integer> inp, List<Integer> out, int index, int l) {
        if (index == l) {
            System.out.println(out);
            return;
        }
        out.add(inp.get(index));
        printLists(inp, out, index + 1, l);
        out.remove(out.size() - 1);
        printLists(inp, out, index + 1, l);
    }


}
