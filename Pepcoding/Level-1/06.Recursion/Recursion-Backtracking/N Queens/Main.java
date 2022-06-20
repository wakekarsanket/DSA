import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        printNQueens(arr, "", 0);
    }

    public static void printNQueens(int[][] chess, String asf, int row) {
        if (row == chess.length) {
            System.out.println(asf + ".");
            return;
        }

        for (int col = 0; col < chess[0].length; col++) {
            if (isQueenSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }

    }

    public static boolean isQueenSafe(int[][] arr, int row, int col) {
        for (int r = row; r >= 0; r--) { // up call
            if (arr[r][col] == 1)
                return false;
        }

        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) { // left up diagonal call
            if (arr[r][c] == 1)
                return false;
        }

        for (int r = row, c = col; r >= 0 && c < arr[0].length; r--, c++) { // right up diagonal call
            if (arr[r][c] == 1)
                return false;
        }

        return true;
    }

}