//question 84:


import java.util.*;
public class Merge_sort {
	
	static void divide(int arr[], int start, int end) {
		if(start>=end) {
			return;
		}
		int mid = start + (end-start)/2;
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		conquer(arr, start, mid, end);
	}
	
	static void conquer(int arr[], int start, int mid, int end) {
		int merged[] = new int[end-start+1];
		int idx1 = start, idx2 = mid+1, x=0;
		while(idx1<=mid && idx2<=end) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			}
			else {
				merged[x++] = arr[idx2++];
			}
		}
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while(idx2<=end) {
			merged[x++] = arr[idx2++];
		}
		for(int i=0, j=start; i<merged.length; i++,j++) {
			arr[j] = merged[i];
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n ; ++i) {
			arr[i] = sc.nextInt();
		}
		divide(arr, 0, n-1);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}

