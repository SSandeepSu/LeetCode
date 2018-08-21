package leetCode;

import java.util.Arrays;

public class SumOfSubsequenceWidths {

    public static void main(String[] args) {
        System.out.println(sumSubseqWidths(new int[]{2,1,3}));
    }

    public static int sumSubseqWidths(int[] A) {
        Arrays.sort(A);
        long c = 1, res = 0, mod = (long)1e9 + 7;
        for (int i = 0; i < A.length; ++i, c = (c << 1) % mod)
            res = (res + A[i] * c - A[A.length - i - 1] * c) % mod;
        return (int)((res + mod) % mod);
    }

}
