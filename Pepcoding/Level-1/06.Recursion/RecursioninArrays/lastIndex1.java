import java.util.Scanner;

public class lastIndex1 {

    public static int lIndex(int[] arr, int idx, int x) {
        if (idx < 0) {
            return -1;
        }
        return arr[idx] == x ? idx : lIndex(arr, idx - 1, x);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(lIndex(arr, arr.length - 1, x));
    }

}
