import java.util.Scanner;

public class firstIndex {

    public static int fIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        return (arr[idx] == x) ? idx : fIndex(arr, idx + 1, x);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(fIndex(arr, 0, x));
    }
}
