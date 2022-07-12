import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> st = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                st.push(ch - '0');
                infix.push(ch + "");
                postfix.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int val1 = st.pop();
                int val2 = st.pop();
                char op = ch;
                int val = value(op, val1, val2);
                st.push(val);

                String post1 = postfix.pop();
                String post2 = postfix.pop();
                postfix.push(post1 + post2 + op);

                String in1 = infix.pop();
                String in2 = infix.pop();
                infix.push("(" + (in1 + op + in2) + ")");
            }
        }

        System.out.println(st.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());
    }

    public static int value(char op, int v1, int v2) {
        if (op == '+')
            return v1 + v2;
        else if (op == '-')
            return v1 - v2;
        else if (op == '*')
            return v1 * v2;
        else
            return v1 / v2;
    }
}