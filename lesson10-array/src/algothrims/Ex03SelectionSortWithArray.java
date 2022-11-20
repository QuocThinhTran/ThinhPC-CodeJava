package algothrims;

import utils.SwapArray;

public class Ex03SelectionSortWithArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9, 7};
        selectionSort(a);
        SwapArray.printf("a", a);
    }
    private static void selectionSort(int[] a) {
        for (int round = a.length-1; round > 0; round--) {
            for (int i = 0; i < round; i++) {
                if(a[i] > a[i+1]) {
                    SwapArray.swap(a, i, i+1);
                }
            }
        }
    }
}
