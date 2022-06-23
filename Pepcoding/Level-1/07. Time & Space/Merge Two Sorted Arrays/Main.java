import java.io.*;
import java.util.*;

public class Main {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int[] arr = new int[m + n];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[idx] = a[i];
                i++;
            } else if (b[j] <= a[i]) {
                arr[idx] = b[j];
                j++;
            }
            idx++;
        }

        while (i < a.length) {
            arr[idx] = a[i];
            i++;
            idx++;
        }

        while (j < b.length) {
            arr[idx] = b[j];
            j++;
            idx++;
        }

        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
    }

}