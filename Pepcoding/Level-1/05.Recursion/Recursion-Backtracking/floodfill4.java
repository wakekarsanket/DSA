import java.util.Scanner;

public class floodfill4 {

    public static int dir[][] = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    public static String dirN[] = { "t", "l", "d", "r" };

    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if (maze.length - 1 == sr && maze[0].length - 1 == sc) {
            System.out.println(asf);
            return;
        }

        maze[sr][sc] = 1;

        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if (!(r >= maze.length || c >= maze[0].length || r < 0 || c < 0 || maze[r][c] == 1)) {
                floodfill(maze, r, c, asf + dirN[d]);
            }
        }

        maze[sr][sc] = 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

}