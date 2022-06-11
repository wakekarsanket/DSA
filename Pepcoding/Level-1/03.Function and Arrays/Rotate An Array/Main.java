import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        k %= a.length;
        if (k < 0) {
            k += a.length;
        }

        // reverse(a, 0, a.length-k-1);              //rotate the first half
        // reverse(a, a.length-k, a.length-1);       //rotate the remaining half
        // reverse(a, 0, a.length-1);                //rotate the whole array

        // OR
        reverse(a, 0, a.length - 1);             //first, rotate the whole array
        reverse(a, 0, k - 1);                    //then rotate first half
        reverse(a, k, a.length - 1);                //then rotate second half
    }

    public static void reverse(int arr[], int li, int ri) {
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}