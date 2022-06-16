public class Main {

    public static int binarySearch(int[] arr, int data) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] < data) {
                i = mid + 1;
            } else if (arr[mid] > data) {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int size = 8;
        int[] a = { 5, 7, 10, 11, 14, 20, 26, 30 };
        int x = 20;
        int ans = binarySearch(a, x);
        System.out.println(ans);
    }

}
