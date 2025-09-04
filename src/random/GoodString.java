package random;

public class GoodString {
    public static void main(String[] args) {
        String str = "abbbcddeeefg";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i==0 || str.charAt(i)!=str.charAt(i-1))
                stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
