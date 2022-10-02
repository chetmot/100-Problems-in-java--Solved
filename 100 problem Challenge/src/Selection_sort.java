//question 83:
import java.util.*;
public class Selection_sort {
	
	static void selectionSort(int arr[], int n) {
		for(int i=0; i<n-1; i++) {
			int idx= i;
			for(int j=i; j<n; j++) {
				if(arr[j]< arr[idx]) {
					idx = j;
				}
			}
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		selectionSort(arr,n);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
