package view;

public class Ex02PermutationInArray {
    public static void main(String[] args) {
        String str = "xyz";
        printPermutationOfString(str, "");
    }
    private static void printPermutationOfString(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0,i) + str.substring(i+1);

            printPermutationOfString(ros, ans + ch);
        }
    }
}
