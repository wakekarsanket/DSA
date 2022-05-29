import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i=low;i<=high;i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
    }
    
    static boolean isPrime(int n){
        int factor = 0;
        for(int div=2;div*div<=n;div++){
            if(n%div==0)
                factor++;
        }
        if(factor==0){
            return true;
        }
        return false;
    }
    
}