import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (q.size() > 0 && arr[i] > arr[q.getLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }

        for (int i = k; i < n; i++) {
            System.out.println(arr[q.getFirst()]);

            while (q.size() > 0 && q.getFirst() <= i - k) {      // to eliminate elements which doesn't lie in our window
                q.removeFirst();
            }

            while (q.size() > 0 && arr[i] >= arr[q.getLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }
        System.out.println(arr[q.getFirst()]);
    }
}