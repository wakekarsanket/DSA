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

        for (int st = 0; st < arr.length; st++) {
            for (int end = st; end < arr.length; end++) {
                for (int k = st; k <= end; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }

    }

}