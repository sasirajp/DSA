package recursion;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] ar = {2, 1, 25, 10, 5, 6, 9, 10, 11};
        sort(ar, ar.length);
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int[] ar, int length) {
        
        if (length == 1)
            return;
        sort(ar, length - 1);
        insertVal(ar, length - 1);
    }

    private static void insertVal(int[] ar, int i) {
        if (i==0 || ar[i-1] <= ar[i])
            return;
        int tmp = ar[i];
        ar[i] = ar[i-1];
        ar[i-1] = tmp;
        insertVal(ar, i -1);
    }



//    private static void sort2(int[] ar, int i) {
//        while (i > 0 && ar[i-1] > ar[i]) {
//            int tmp = ar[i];
//            ar[i] = ar[i-1];
//            ar[i-1] = tmp;
//            i--;
//        }
//        System.out.println(Arrays.toString(ar));
//    }
}
