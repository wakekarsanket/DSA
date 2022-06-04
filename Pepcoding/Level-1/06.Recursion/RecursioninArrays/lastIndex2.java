import java.util.Scanner;

public class lastIndex2 {

    public static int lIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int li = lIndex(arr, idx + 1, x);
        if (li == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return li;
            }
        } else {
            return li;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(lIndex(arr, 0, x));
    }

}
