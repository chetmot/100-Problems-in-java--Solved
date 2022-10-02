//question 85:

import java.util.*;
public class Quick_sort {
	
	static void quickSort(int arr[], int high, int low) {
		if(low<high) {
			int pivot = partition(arr,low,high);
			quickSort(arr,pivot-1,low);
			quickSort(arr,high,pivot+1);					
		}
	}
	
	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i]=pivot;
		arr[high] = temp;
		return i;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n ; ++i) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr,n-1,0);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}

