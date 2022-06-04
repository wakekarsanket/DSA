import java.util.Scanner;

public class displayArray {

    // public static void displayArr1(int arr[], int idx) {
    // idx is zero
    // if (idx == arr.length) {
    // return;
    // }
    // System.out.println(arr[idx]);
    // displayArr1(arr, idx + 1);
    // }

    public static void displayArr2(int arr[], int idx) {
        // idx is (arr.length-1)
        if (idx < 0) {
            return;
        }
        displayArr2(arr, idx - 1);
        System.out.println(arr[idx]);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // displayArr1(arr, 0);
        displayArr2(arr, n - 1);
    }

}