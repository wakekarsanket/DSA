import java.util.Scanner;

public class factorial {

    public static int fact(int n) {
        return (n==0)?1:n*fact(n-1);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fact(n));
    }

}
