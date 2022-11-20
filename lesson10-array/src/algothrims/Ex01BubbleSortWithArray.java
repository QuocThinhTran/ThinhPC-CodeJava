package algothrims;

import utils.SwapArray;

public class Ex01BubbleSortWithArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9, 7};
        bubbleSort(a);
        SwapArray.printf("a",a);
    }

    private static void bubbleSort(int[] a) {
        for(int round = 0; round < a.length; round++) {
            for(int i = 0; i < a.length-round-1; i++) {
                if(a[i] > a[i+1]) {
                    SwapArray.swap(a, i, i+1);
                }
            }
        }
    }

}
