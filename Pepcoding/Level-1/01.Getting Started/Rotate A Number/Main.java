import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int r = scn.nextInt();
     
     int num=n,count=0;
     while(num>0){
        num = num / 10; 
        count++;
     }
     
     r = r % count;
     if(r<0){
         r = count + r;
     }
     int div = (int)Math.pow(10,r);
     int mul = (int)Math.pow(10,count-r);
     
     int quo = n / div;
     int rem = n % div;
     
     int ans = rem * mul + quo;
     System.out.println(ans);
     
    }
   }