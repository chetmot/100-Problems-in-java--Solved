//question 46:
//Given a sequence of positive integers a1,a2,…,aN, if you take each of its 2^N subsequences and write down the sum of elements of this subsequence, Find out what will be the bitwise OR of the written integers.
//
//Input Format
//
//The first line contains a single integer N.
//
//The second line contains N space-separated integers a1,a2,…,aN.
//
//Constraints
//
//1≤N≤10^5
//
//1≤ai<2^20 for each valid i
//
//Output Format
//
//Print a single line containing one integer ― the bitwise OR of sums of all subsequences.
import java.util.*;
public class OR_Sum_SubSeq {
	
	public static int[] subsequences(int arr[], int n) {
		int sum=0, k=0;
		int[] sums = new int[(int) Math.pow(2, n)];
		for(int i=0 ;i<(1<<n); i++) {
			sum=0;
			for(int j=0; j<n; j++) {
				if((i&(1<<j))>0) {
					sum+=arr[j];
				}
			}
			sums[k]=sum;
			k++;
		}
		return sums;
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int[] sums = new int[(int) Math.pow(2, n)];
		int ans=0;
		sums= subsequences(arr,n);
		for(int i=0; i<(int)Math.pow(2,n); i++) {
			ans = ans|sums[i];
		}
		System.out.println(ans);
	}
}

