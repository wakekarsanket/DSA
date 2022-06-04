import java.util.Scanner;

public class printMazePathswithJump1 {

    static int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
    static String[] dirN = { "h", "v", "d" };

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        for (int d = 0; d < dir.length; d++) {
            for (int jump = 1; jump <= Math.max(dr, dc); jump++) {
                int r = sr + (jump * dir[d][0]);
                int c = sc + (jump * dir[d][1]);

                if (r >= 0 && r <= dr && c >= 0 && c <= dc) {
                    printMazePaths(r, c, dr, dc, psf + dirN[d] + jump);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
    }

}
