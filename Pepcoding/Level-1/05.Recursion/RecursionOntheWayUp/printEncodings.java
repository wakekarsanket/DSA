import java.util.Scanner;

public class printEncodings {

    public static void printEncod(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // first call for one char
        if (str.charAt(0) == '0') {
            return;
        }
        char ch1 = str.charAt(0);    //'6'
        int v1 = ch1 - '0';          // 6 --> int
        printEncod(str.substring(1), ans + (char) ('a' + v1 - 1));

        // for second call of 2 chars since, max. value is 26 of z
        if (str.length() > 1) {
            char ch2 = str.charAt(1);
            int v2 = ch2 - '0';
            int num = v1 * 10 + v2;
            if (num <= 26) {
                printEncod(str.substring(2), ans + (char) ('a' + num - 1));
            }
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncod(str, "");
    }

}
