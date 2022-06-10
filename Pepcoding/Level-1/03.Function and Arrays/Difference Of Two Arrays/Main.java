import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] ans = new int[n2];
        int i = a2.length - 1, j = a1.length - 1, k = ans.length - 1, borrow = 0;
        while (i >= 0) {

            int diff = a2[i] - (j >= 0 ? a1[j] : 0) + borrow;
            if (diff < 0) {
                diff += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ans[k] = diff % 10;

            i--;
            j--;
            k--;
        }

        // Edgecase 1000-999=0001
        int idx;
        for (idx = 0; idx < ans.length; idx++) {
            if (ans[idx] > 0) {
                break;
            }
        }

        while (idx < ans.length) {
            System.out.println(ans[idx]);
            idx++;
        }

    }

}