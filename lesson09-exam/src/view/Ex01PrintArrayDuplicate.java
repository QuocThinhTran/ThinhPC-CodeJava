package view;

public class Ex01PrintArrayDuplicate {
    public static void main(String[] args) {
        int[] a = {12, 1, 3, 9, 6};
        int[] b = {12, 9, 8, 11, 5, 3};

        for(int i = 0; i < a.length; i++) {
            int count = 0;
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
