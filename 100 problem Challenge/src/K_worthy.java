//Question 37:
//You are given an integer matrix A with N rows (numbered 1 through N) and M columns (numbered 1 through M).
//
//This matrix has two interesting properties:
//
//The integers in each row form a non-decreasing sequence, i.e. for each valid i, A[i,1]≤A[i,2]≤…≤A[i,M].
//The integers in each column also form a non-decreasing sequence, i.e. for each valid j, A[1,j]≤A[2,j]≤…≤A[N,j].
//A K-worthy submatrix is a square submatrix of A, i.e. a submatrix with l rows and l columns, for any integer l, such that the average of all the integers in this submatrix is ≥K.
//
//Find the number of K-worthy submatrices of A.
//
//Input Format
//
//The first line of each test case contains three space-separated integers N, M and K.
//
//N lines follow. For each valid i, the i-th of these lines contains M space-separated integers A[i,1],A[i,2],A[i,3],…,A[i,M].
//
//Constraints
//
//1≤N,M≤10⁶
//
//N≤M
//
//0≤K≤10⁶
//
//0≤aij≤10⁶ for each valid i,j
//
//Output Format
//
//Print a single line containing one integer ― the number of K-worthy submatrices of A.
import java.util.*;
public class K_worthy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,m,k,count=0;
		n=sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]>=k) count++;
			}
		}
		double avg1 = (arr[n-1][m-1]+arr[n-2][m-1]+arr[n-1][m-2]+arr[n-2][m-2])/4;
		if(avg1>=k) count++;
		double avg2 = (arr[n-1][m-3]+arr[n-1][m-2]+arr[n-2][m-3]+arr[n-2][m-2])/4;
		if(avg2>=k) count++;
		System.out.println(count);
	}
}

