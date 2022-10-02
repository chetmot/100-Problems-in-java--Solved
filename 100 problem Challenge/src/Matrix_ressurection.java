//question 50:
//You are provided with a matrix of N rows (numbered 1 through N from top to bottom) and N columns (numbered 1 through N from left to right) containing all integers between 1 and N^2 inclusive. For each valid i and j, let's denote the cell in the i-th row and j-th column by (i,j).
//
//The task is to sort the matrix in row-major order ― for each valid i and j, the cell (i,j) should contain the value (i−1)⋅N+j.
//
//In one operation, you should choose an integer L and transpose the submatrix between rows 1 and L and columns 1 and L (inclusive). Formally, for each i and j (1≤i,j≤L), the value in the cell (i,j) after this operation is equal to the value in (j,i) before it.
//
//The initial state of the matrix is chosen in such a way that it is possible to sort it using a finite number of operations (possibly zero). Find the smallest number of operations required to sort the matrix.
//
//Input Format
//
//The first line contains a single integer N.
//
//The next N lines describe the matrix. For each valid i, the i-th of these lines contains N space-separated integers ― the initial values in cells (i,1),(i,2),…,(i,N).
//
//Constraints
//
//4≤N≤64
//
//Output Format
//
//Print a single line containing one integer ― the smallest number of operations required to sort the matrix.
import java.util.*;
public class Matrix_ressurection {
	public static void main(String arg[]) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int[][] res = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
				res[i][j]=n*i+j+1;
			}
		}
		int count=0,check=0;
		int []correct = new int[n];
		for(int i=0; i<n; i++) {
			if(arr[0][i]==res[0][i]) correct[i]=1;
			else correct[i]=0;
		}
		for(int i=n-1; i>=0; i--) {
			if(correct[i]==0) {
				count++;
				correct[i]=1;
				for(int j=1; j<i; j++) {
					if(correct[j]==1) correct[j]=0;
					else correct[j]=1;
				}
			}
		}
		System.out.println(count);
	}
}

