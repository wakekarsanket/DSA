import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String str) {

        int n = str.length();
        int fact = fact(str.length());

        for (int f = 0; f < fact; f++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = f;
            for (int div = n; div >= 1; div--) {
                int rem = temp % div;
                temp /= div;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
            }
            System.out.println();
        }

    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}