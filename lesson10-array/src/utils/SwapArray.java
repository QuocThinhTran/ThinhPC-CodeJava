package utils;

import java.util.Arrays;

public class SwapArray {
    private SwapArray() {

    }
    public static void swap(int[] source, int i, int j) {
        int tmp = source[i];
        source[i] = source[j];
        source[j] = tmp;
    }
    public static void printf(String prefix, int[] a) {
        System.out.println(prefix + " --------> " + Arrays.toString(a));
    }
}
