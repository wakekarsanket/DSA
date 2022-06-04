import java.util.Scanner;

public class printPermutations {

    public static void printPer(String str, String ans) {
        if (str.equals("")) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPer(ros, ans + ch);
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPer(str, "");
    }

}
