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
        int data = scn.nextInt();

        int lo = 0;
        int hi = arr.length - 1;
        int floor = 0, ceil = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data == arr[mid]) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } else if (arr[mid] < data) {
                lo = mid + 1;
                floor = arr[mid];
            } else {
                hi = mid - 1;
                ceil = arr[mid];
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

}