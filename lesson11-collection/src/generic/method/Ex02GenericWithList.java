package generic.method;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericWithList {
    public static void main(String[] args) {
        List<String> sList = Arrays.asList("hello", "halla", "hille");
        List<Integer> iList = Arrays.asList(2, 4, 4, 2);
        List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);

        printArray("sList", sList);
        printArray("dList", dList);
        printArray("iList", iList);
        System.out.println("-----------------------------------------------------------------------");

        printWildCard("iList", iList);
    }

    private static void printWildCard(String prefix, List<? super Integer> list) {
        System.out.print(prefix + " -------------------> ");
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    private static <E> void printArray(String prefix, List<E> e) {
        System.out.print(prefix + " ---------------> ");
        for(E obj : e) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}
