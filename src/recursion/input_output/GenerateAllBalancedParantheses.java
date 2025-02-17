package recursion.input_output;

public class GenerateAllBalancedParantheses {

    public static void main(String[] args) {
        int n = 3;
        new GenerateAllBalancedParantheses().generate("", n, n);
    }

    private void generate(String out, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.println(out);
        } else {
            if (open > 0)
                generate(out + "(", open - 1, close);
            if (open < close)
                generate(out + ")", open, close - 1);
        }
    }

}
