import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // map.put(ch,map.getOrDefault(ch,0)+1);
            if (map.containsKey(ch) == false) {
                map.put(ch, 1);
            } else {
                int of = map.get(ch);
                int nf = of + 1;
                map.put(ch, nf);
            }
        }
        char maxch = str.charAt(0);
        int maxfreq = map.get(maxch);
        for (char ch : map.keySet()) {
            int val = map.get(ch);
            if (val > maxfreq) {
                maxfreq = val;
                maxch = ch;
            }
        }
        System.out.println(maxch);
    }

}