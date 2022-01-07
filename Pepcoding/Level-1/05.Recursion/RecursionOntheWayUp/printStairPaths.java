import java.util.Scanner;

public class printStairPaths {

    public static void printSP(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }
        for (int step = 1; step <= 3; step++) {
            if (n - step >= 0) {
                printSP(n - step, path + step);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printSP(n, "");
    }

}
