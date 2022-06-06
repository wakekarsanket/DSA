import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int val = getValue(n, sourceBase, destBase);
        System.out.println(val);
    }

    public static int getValue(int n, int sb, int db) {

        int dec = anyBaseToDeci(n, sb);
        int dn = DeciToAnyBase(dec, db);
        return dn;
    }

    public static int anyBaseToDeci(int n, int sb) {

        int ans = 0, i = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans += rem * (int) Math.pow(sb, i);
            i++;
        }
        return ans;
    }

    public static int DeciToAnyBase(int n, int sb) {

        int i = 0, ans = 0;
        while (n > 0) {
            int rem = n % sb;
            n /= sb;
            ans += rem * Math.pow(10, i);
            i++;
        }
        return ans;
    }
}