import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        rotateShell(arr, s, r);
        display(arr);
    }

    public static void rotateShell(int[][] arr, int s, int r) {
        // from 2D(shell) to 1D
        // rotate
        // from 1D to 2D

        int[] oneD = fillOneDFromShell(arr, s);
        rotate(oneD, r);
        fillShellFromOneD(oneD, arr, s);
    }

    public static int[] fillOneDFromShell(int[][] arr, int s) {

        int minr = s - 1, minc = s - 1, maxr = arr.length - s, maxc = arr[0].length - s;
        int sz = 2 * (maxr - minr + maxc - minc);

        int[] oneD = new int[sz];

        int idx = 0;
        // lw
        for (int i = minr, j = minc; i <= maxr; i++) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        // bw
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        // rw
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        // tw
        for (int i = minr, j = maxc - 1; j > minc; j--) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        return oneD;
    }

    public static void fillShellFromOneD(int[] oneD, int[][] arr, int s) {
        int minr = s - 1, minc = s - 1, maxr = arr.length - s, maxc = arr[0].length - s;

        int idx = 0;
        // lw
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        // bw
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        // rw
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        // lw
        for (int i = minr, j = maxc - 1; j > minc; j--) {
            arr[i][j] = oneD[idx];
            idx++;
        }
    }

    public static void rotate(int[] oneD, int r) {
        r = r % oneD.length;
        if (r < 0) {
            r = r + oneD.length;
        }

        reverse(oneD, 0, oneD.length - r - 1);
        reverse(oneD, oneD.length - r, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);
    }

    public static void reverse(int[] oneD, int li, int ri) {
        while (li < ri) {
            int temp = oneD[li];
            oneD[li] = oneD[ri];
            oneD[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}