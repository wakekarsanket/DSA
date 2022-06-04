import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        //lower matrix
        // for (int gap = arr.length-1; gap > 0; gap--) {
        //     for (int i = gap, j = 0; i < arr.length && j < arr[0].length; i++, j++) {
        //         System.out.println(arr[i][j]);
        //     }
        // }

        //upper matrix
        for (int gap = 0; gap < arr[0].length; gap++) {
            for (int i = 0, j = gap; i < arr.length && j < arr[0].length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

}