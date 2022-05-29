import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int num = n;
      
      int c=0;
    while(n>0){
        n = n / 10;
        c++;
    }
      
      int dig;
      while(c>0){
          dig = num / (int)Math.pow(10,c-1);
          System.out.println(dig);
          num = num % (int)Math.pow(10,c-1);
          c--;
      }
      
     }
    }