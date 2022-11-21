package generic.method;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ex01GenericMethodWithArray {
    public static void main(String[] args) {
       Double[] dList = {1d, 2d, 3d, 4d};
       Integer[] iList = {2, 4, 4, 2};
       String[] sList = {"hello", "halla", "hille"};

        printf("dList", dList);
        printf("iList", iList);
        printf("sList", sList);
        System.out.println("------------------------------------------------------------------------");

        printfArray("dList", dList);
        printfArray("iList", iList);
        printfArray("sList", sList);

    }

    private static void printf(String prefix, Object[] objects) {
        System.out.print(prefix + " --------> ");
        for(Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    private static <E> void printfArray(String prefix, E[] e) {
        System.out.print(prefix + " --------> ");
        for(E obj : e) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}
