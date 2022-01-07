import java.util.Scanner;
import java.util.ArrayList;

public class getMazePathswithJump {

    public static ArrayList<String> gMPJ(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        for (int jump = 1; sc + jump <= dc; jump++) { // horizontal
            ArrayList<String> hcall = gMPJ(sr, sc + jump, dr, dc);
            for (String ele : hcall) {
                myAns.add("h" + jump + ele);
            }
        }

        for (int jump = 1; sr + jump <= dr; jump++) { // vertical
            ArrayList<String> vcall = gMPJ(sr + jump, sc, dr, dc);
            for (String ele : vcall) {
                myAns.add("v" + jump + ele);
            }
        }

        for (int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++) { // diagonal
            ArrayList<String> dcall = gMPJ(sr + jump, sc + jump, dr, dc);
            for (String ele : dcall) {
                myAns.add("d" + jump + ele);
            }
        }

        return myAns;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = gMPJ(0, 0, n - 1, m - 1);
        System.out.println(ans);
    }

}
