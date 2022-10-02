//Question 18 : 
//Given a matrix A of r rows and c columns. You need to print the matrix column wise and zigzag fashion. That is first print the first column from top to bottom, then second column from bottom to top and so on for all the columns
//
//Input Format
//
//The first Line contains two space separated integers r and c
//
//Each of the next r lines contain c space separated integers
//
//Constraints
//
//1 <= r, c <= 100 1 <= A[i][j] <= 10^9
//
//Output Format
//
//Print the all the elements of the matrix in one space separated line
import java.io.*;
import java.util.*;

public class ZigZag_ColumnMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, i, j;
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] arr= new int[r][c];
        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        j=0;
        while(j<c){
            if(j%2==1){
                for(i=r-1; i>=0; i--) System.out.print(arr[i][j]+" ");
            }
            else {
                for(i=0; i<r; i++) System.out.print(arr[i][j]+" ");
            }
            j=j+1;
        }
    }
}