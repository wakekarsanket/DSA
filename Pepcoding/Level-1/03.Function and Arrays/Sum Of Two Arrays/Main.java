import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        int[] ans = new int[(n1 > n2 ? n1 : n2)+1];

        int i = a1.length - 1, j = a2.length - 1, k = ans.length - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry>0) {
            // int sum = carry;
            // if (i >= 0) {
            //     sum += a1[i];
            // }
            // if (j >= 0) {
            //     sum += a2[j];
            // }
            int sum = carry+(i>=0?a1[i]:0)+(j>=0?a2[j]:0);

            carry = sum / 10;
            sum %= 10;
            ans[k] = sum;
            i--;
            j--;
            k--;
        }

        if(carry > 0) {
            System.out.println(carry);
        }

        for (int x = 0; x < ans.length; x++) {
            if(x==0 && ans[x]==0){
                
            }else{
            System.out.println(ans[x]);
            }
        }
    }

}