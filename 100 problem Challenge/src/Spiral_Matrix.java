//Question 2 : 
//Given a matrix M of size r X c, you need to print the elements in spiral order starting from (0,0) cell and then moving towards the right.

//Input Format

//The first line contains two integers separated by space. r and c

//The next r lines contain c integers separated by space denoting row of matrix

//Constraints

//1 <= |r|,|c| <= 100

//Output Format

//Print the matrix in spiral form with each element separated by space

import java.util.*;

public class Spiral_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][]arr = new int [r][c];
        int [][]seen = new int[r][c];
        int i, j;
        for(i=0; i<r; ++i) {
            for(j=0; j<c; ++j) {
                arr[i][j] = sc.nextInt();
                seen[i][j]=0;
            }
        }        
        int start_row=0, start_col=0, end_row=r-1, end_col=c-1;
        while(start_row<=end_row && start_col<=end_col) {
            for(i=start_col; i<=end_col; i++) {
                if(seen[start_row][i]==0) {
                    System.out.print(arr[start_row][i]+" ");
                    seen[start_row][i]=1;
                }
            }
            start_row++;
            for(i=start_col; i<=end_row; i++) {
                if(seen[i][end_col]==0) {
                    System.out.print(arr[i][end_col]+" ");
                    seen[i][end_col]=1;
                }
            }
            end_col--;
            for(i=end_col; i>=start_col; i--) {
                if(seen[end_row][i]==0) {
                    System.out.print(arr[end_row][i]+" ");
                    seen[end_row][i]=1;
                }                
            }
            end_row--;
            for(i=end_row; i>=start_row; i--) {
                if(seen[i][start_col]==0) {
                    System.out.print(arr[i][start_col]+" ");
                    seen[i][start_col]=1;
                }                
            }
            start_col++;
        }
    }
}