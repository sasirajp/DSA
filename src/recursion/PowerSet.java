package recursion;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abcdef";
         new PowerSet().printSets(str, "", 0, str.length() - 1);
    }

    private void printSets(String str, String out, int index, int l) {
        if (index == l) {
            System.out.println(out);
            return;
        }
        printSets(str, out + str.charAt(index), index + 1, l);
        printSets(str, out, index + 1, l);
    }


}
