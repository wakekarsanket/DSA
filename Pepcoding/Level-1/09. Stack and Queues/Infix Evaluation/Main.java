import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> opd = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                opr.push(ch);
            } else if (ch >= '0' && ch <= '9') { // Character.isDigit(ch)
                opd.push(ch - '0');
            } else if (ch == ')') {
                while (opr.size() > 0 && opr.peek() != '(') {
                    int val2 = opd.pop();
                    int val1 = opd.pop();
                    char c = opr.pop();

                    int val = value(c, val1, val2);
                    opd.push(val);
                }
                opr.pop();                       //pop opening bracket
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (opr.size() > 0 && opr.peek() != '(' && priority(ch) <= priority(opr.peek())) {
                    int val2 = opd.pop();
                    int val1 = opd.pop();
                    char c = opr.pop();

                    int val = value(c, val1, val2);
                    opd.push(val);
                }
                opr.push(ch);
            }
        }
        while (opr.size() > 0) {
            int val2 = opd.pop();
            int val1 = opd.pop();
            char c = opr.pop();

            int val = value(c, val1, val2);
            opd.push(val);
        }
        System.out.println(opd.pop());
    }

    public static int priority(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else
            return 0;
    }

    public static int value(char ch, int val1, int val2) {
        if (ch == '+')
            return val1 + val2;
        else if (ch == '-')
            return val1 - val2;
        else if (ch == '*')
            return val1 * val2;
        else
            return val1 / val2;
    }
}