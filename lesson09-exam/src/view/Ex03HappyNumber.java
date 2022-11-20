package view;

import java.util.HashSet;

public class Ex03HappyNumber {
    public static void main(String[] args) {
       int n = 44;
       if(isHappyNumber(n)) {
           System.out.println(n + " is happy number ");
       } else {
           System.out.println(n + " is not happy number ");
       }
    }
    private static int numSquareSum(int n) {
        int sumSquare = 0;
        while (n != 0) {
            sumSquare += (n % 10) * (n % 10);
            n /= 10;
        }
        return sumSquare;
    }
    private static boolean isHappyNumber(int n) {
       HashSet<Integer> st = new HashSet<>();
       while (true) {
           n = numSquareSum(n);
           if(n == 1) {
               return true;
           }
           if(st.contains(n)) {
               return false;
           }
           st.add(n);
       }
    }
}
