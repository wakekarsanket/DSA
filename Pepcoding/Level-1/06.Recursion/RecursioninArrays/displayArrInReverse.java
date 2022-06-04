import java.util.Scanner;

public class displayArrInReverse {

    // public static void displayArrReverse1(int[] arr, int idx) {
        //for (idx = arr.length-1)
    // if (idx < 0) {
    // return;
    // }
    // System.out.println(arr[idx]);
    // displayArrReverse1(arr, idx - 1);
    // }

    public static void displayArrReverse2(int[] arr, int idx) {
        //for idx = 0
        if (idx == arr.length) {
            return;
        }
        displayArrReverse2(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // displayArrReverse1(arr, n - 1);
        displayArrReverse2(arr, 0);
    }
}
