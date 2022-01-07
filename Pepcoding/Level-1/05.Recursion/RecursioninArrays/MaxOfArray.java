import java.util.Scanner;

public class MaxOfArray {

    public static int maxOfArr(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int recAns = maxOfArr(arr, idx + 1);
        int me = arr[idx];
        return (me > recAns) ? me : recAns;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(maxOfArr(arr, 0));
    }

}
