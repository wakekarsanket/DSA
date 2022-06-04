import java.util.Scanner;

public class powerLinear {

    public static int power(int x, int n) {
        return (n==0)?1:x*power(x,n-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
    }
}
