package algothrims;

import utils.SwapArray;

public class Ex02InsertionSortWithArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9, 7};
        insertionSort(a);
        SwapArray.printf("a", a);
    }
    private static void insertionSort(int[] a) {
        for (int round = 1; round < a.length; round++) {
            for(int i = 0; i < round; i++) {
                if(a[i] > a[round]) {
                    SwapArray.swap(a, i, round);
                }
            }
        }
    }
}
