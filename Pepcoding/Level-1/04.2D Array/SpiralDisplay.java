import java.io.*;
import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] mat = new int[n][m];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
        int minr=0,maxr=mat.length-1,minc=0,maxc=mat[0].length-1,tne=n*m;
        while(tne>0){
            
            //lw
            for(int r=minr;r<=maxr && tne>0;r++){
                System.out.println(mat[r][minc]);
                tne--;
            }
            minc++;
            
            //bw
            for(int c=minc;c<=maxc && tne>0;c++){
                System.out.println(mat[maxr][c]);
                tne--;
            }
            maxr--;
            
            //rw
            for(int r=maxr;r>=minr && tne>0;r--){
                System.out.println(mat[r][maxc]);
                tne--;
            }
            maxc--;
            
            //tw
            for(int c=maxc;c>=minc && tne>0;c--){
                System.out.println(mat[minr][c]);
                tne--;
            }
            minr++;
            
        }
        
        
    }

}