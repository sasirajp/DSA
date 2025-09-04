package practice;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        printSubSets(str, 0, str.length(), "");
    }

    private static void printSubSets(String str, int index, int l, String out) {
        if (index == l) {
            System.out.println(out);
            return;
        }
        printSubSets(str, index + 1, l, out + str.charAt(index));
        printSubSets(str, index + 1, l, out);
    }
}
