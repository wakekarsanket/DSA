import java.util.Scanner;

public class printMazePaths {

    public static void printMP(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        if (sc + 1 <= dc) { // horizontal call
            printMP(sr, sc + 1, dr, dc, psf + "h");
        }
        if (sr + 1 <= dr) { // vertical call
            printMP(sr + 1, sc, dr, dc, psf + "v");
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMP(0, 0, n - 1, m - 1, "");
    }
}
