import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePaths {

    public static ArrayList<String> getMP(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        if (sc + 1 <= dc) { // horizontal
            ArrayList<String> hcall = getMP(sr, sc + 1, dr, dc);
            for (String ele : hcall) {
                myAns.add("h" + ele);
            }
        }

        if (sr + 1 <= dr) { // vertical call
            ArrayList<String> vcall = getMP(sr + 1, sc, dr, dc);
            for (String ele : vcall) {
                myAns.add("v" + ele);
            }
        }

        return myAns;

    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMP(0, 0, n - 1, m - 1);
        System.out.println(ans);
    }

}
