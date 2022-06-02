import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int r=0;r<arr.length;r++){
            int mincidx = leastinrow(arr,r);
            int maxridx = maxinminc(arr,mincidx);
            if(maxridx == r){
                System.out.println(arr[maxridx][mincidx]);
                return;
            }
        }
        
        System.out.println("Invalid input");
        
    }
    
    public static int leastinrow(int arr[][], int r){
        int mini=arr[r][0],minc=0;
        
        for(int c=1;c<arr[0].length;c++){
            if(mini > arr[r][c]){
               mini = arr[r][c]; 
               minc = c;
            }
        }
        return minc;
    }
    
    public static int maxinminc(int arr[][], int c){
        int maxi=arr[0][c],maxr=0;
        
        for(int r=1;r<arr.length;r++){
            if(maxi < arr[r][c]){
               maxi = arr[r][c]; 
               maxr = r;
            }
        }
        return maxr;
    }
    
    

}