package recursion.input_output;

public class GenerateNBitArrayMoreOnesThanZeros {

    public static void main(String[] args) {
        int n = 3;
        new GenerateNBitArrayMoreOnesThanZeros().generate("", 0, 0, n);
    }

    private void generate(String out, int ones, int zeros, int n) {
        if (ones + zeros == n) {
            System.out.println(out);
        } else {
            if (ones > zeros)
                generate(out + "0", ones, zeros + 1, n);
            generate(out + "1", ones + 1, zeros, n);
        }
    }

}
