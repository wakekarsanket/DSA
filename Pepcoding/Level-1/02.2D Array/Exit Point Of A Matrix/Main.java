import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int r = 0, c = 0, dir = 0;
        while (true) {

            if (r > arr.length - 1) {
                r--;
                break;
            } else if (c > arr[0].length - 1) {
                c--;
                break;
            } else if (r < 0) {
                r++;
                break;
            } else if (c < 0) {
                c++;
                break;
            }

            dir += arr[r][c] % 4;

            if (dir == 0) { // east
                c++;
            } else if (dir == 1) { // south
                r++;
            } else if (dir == 2) { // west
                c--;
            } else if (dir == 3) { // north
                r--;
            }

        }

        System.out.println(r);
        System.out.println(c);

    }

}