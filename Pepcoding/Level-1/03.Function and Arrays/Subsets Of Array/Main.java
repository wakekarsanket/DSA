import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int sub = (int) Math.pow(2, arr.length); // for no. of subsets

        for (int i = 0; i < sub; i++) { // for subsets
            int temp = i;
            String str = "";
            for (int j = arr.length - 1; j >= 0; j--) { // for arr
                int rem = temp % 2; // for Binary mapping
                temp = temp / 2;
                if (rem == 0) {
                    str = "-" + "\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }

    }

}