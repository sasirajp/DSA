package recursion;

public class KthGrammer {
    public static void main(String[] args) {
        int n = 3, k = 1;
        kthGrammar(n, k);
    }

//    public int kthGrammar(int n, int k) {
//        StringBuilder str = new StringBuilder("0");
//        StringBuilder currStr;
//        for (int i = 2; i <= n; i++) {
//            currStr = new StringBuilder();
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) == '0') {
//                    currStr.append("01");
//                } else {
//                    currStr.append("10");
//                }
//            }
//            str = new StringBuilder(currStr.toString());
//        }
//        System.out.println(str);
//        return str.charAt(k - 1) - '0';
//    }

    public static int kthGrammar(int n, int k) {
        if (n == 1 || k == 1) return 0;
        int mid = (int) Math.pow(2, n-1) / 2;
        if (mid <= k) {
            return kthGrammar(n-1, k);
        } else {
            return 1 - kthGrammar(n - 1, k - mid);
        }
    }

}
