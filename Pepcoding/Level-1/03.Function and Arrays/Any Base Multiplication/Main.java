import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {

        int i = 0, carry = 0, ans = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10, d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int sum = d1 + d2 + carry;
            int dig = sum % b;
            carry = sum / b;

            ans += dig * (int) Math.pow(10, i);
            i++;
        }
        return ans;
    }

    public static int prodwithSingleDigit(int b, int n1, int n2) {
        int ans = 0, c = 0, i = 0;

        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10, d2 = n2 % 10;
            n1 /= 10;

            int mul = d1 * d2 + c;
            c = mul / b;
            mul %= b;

            ans += mul * Math.pow(10, i);
            i++;
        }
        return ans;
    }

    public static int getProduct(int b, int n1, int n2) {

        int ans = 0, mul = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 /= 10;

            int pwsd = prodwithSingleDigit(b, n1, d2);
            ans = getSum(b, ans, pwsd * mul);
            mul *= 10;
        }
        return ans;
    }

}