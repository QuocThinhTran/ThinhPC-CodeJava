package algothrims;

import java.util.Arrays;

public class Ex04AddElementInArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9, 7};

        System.out.println(Arrays.toString(add(a, 99, 2)));
    }
    private static int[] add(int[] source, int newValue, int k) {
        int[] result = new int[source.length + 1];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }
        for(int i = result.length-1; i > k; i--) {
            result[i] = result[i-1];
        }
        result[k++] = newValue;
        return result;
    }
}
