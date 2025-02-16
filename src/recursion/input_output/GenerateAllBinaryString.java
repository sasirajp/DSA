package recursion.input_output;

public class GenerateAllBinaryString {

    public static void main(String[] args) {
        int n = 3;
        new GenerateAllBinaryString().generate(0, n, "");
    }

    private void generate(int i, int n, String out) {
        if (i == n) {
            System.out.println(out);
            return;
        }
        generate(i + 1, n, out + "0");
        generate(i + 1, n, out + "1");
    }

}
