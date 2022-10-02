////Question 38:
//You are given a sequence A1,A2,…,AN and you have to perform the following operation exactly X times:
//
//Choose two integers i and j such that 1≤i
//Choose a non-negative integer p.
//Change Ai to Ai⊕2^p, and change Aj to Aj⊕2^p, where ⊕ denotes bitwise XOR.
//Find the lexicographically smallest sequence which can be obtained by performing this operation exactly X times.
//
//A sequence B1,B2,…,BN is said to be lexicographically smaller than a sequence C1,C2,…,CN if there is an index i such that Bi < Ci and for each valid j < i, Bj=Cj
//
//Input Format
//
//The first line of each test case contains two space-separated integers N and X.
//
//The second line contains N space-separated integers A1,A2,…,AN.
//
//Constraints
//
//2≤N≤10^5
//
//1≤X≤10^9
//
//1≤Ai≤10^9 for each valid i
//
//Output Format
//
//Print a single line containing N space-separated integers ― the lexicographically smallest obtainable sequence.
import java.util.*;
public class LEXOR {
	
	static int log2(int N) {
        int result = (int)(Math.log(N) / Math.log(2));	 
        return result;
    }
	
	public static void main(String args[]) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int i=0, flag =1;
		while(i<n) {			
			while(arr[i] != 0) {
				double p =  Math.floor(log2(arr[i]));
				arr[i] = arr[i] ^ (int)Math.pow(2, p);
				for(int j=i+1; j<n; j++) {
					int xor = arr[j] ^ (int)Math.pow(2, p);
					if(xor < arr[j] && arr[j] != 0) {
						arr[j]=xor;
						break;
					}
					if(j==n-1) {
						arr[j]=xor;
					}
				}
				t--;
				if(t==0) break;
			}
			if(t==0) break;
			i++;
			if(i==n-1) break;
		}
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
