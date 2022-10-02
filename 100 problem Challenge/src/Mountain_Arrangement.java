//Question 42:
//You are a game designer and want to make an obstacle course. The player will walk from left to right. You have n heights of mountains already selected and want to arrange them so that the absolute difference of the heights of the first and last mountains is as small as possible.
//
//In addition, you want to make the game difficult, and since walking uphill or flat is harder than walking downhill, the difficulty of the level will be the number of mountains i (1 ≤ i < n) such that hi≤hi+1 where hi is the height of the i-th mountain. You don't want to waste any of the mountains you modelled, so you have to use all of them.
//
//From all the arrangements that minimize |h1−hn|, find one that is the most difficult.
//
//Input Format
//
//The first line contains a single integer n — the number of mountains.
//
//The second line contains n integers h1,…,hn, where hi is the height of the i-th mountain.
//
//Constraints
//
//1≤n≤10^4
//
//1≤hi≤10^6
//
//Output Format
//
//Output n integers — the given heights in an order that maximizes the difficulty score among all orders that minimize |h1−hn|.
import java.util.*;
public class Mountain_Arrangement {
	
	static int minDiff(int arr[], int n) {
		int idx = 0, min = arr[n-1]-arr[0];
		for(int i=0; i<n-1; i++) {
			int diff = arr[i+1] - arr[i];
			if(min>diff) {
				idx=i;
				min=diff;
			}
		}
		return idx;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int idx = minDiff(arr,n);
		System.out.print(arr[idx] + " ");
		for(int i=idx + 2; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i=0; i<idx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print(arr[idx+1]);
	}
}

