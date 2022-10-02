//question 81:
import java.util.*;
public class Insertion_Sort {
	
	static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	static void insertionSort(int arr[], int n) {
		int iter, jter;
		for(iter=0; iter<n; iter++) {
			int current_element=arr[iter];
			jter=iter-1;
			while(jter>=0 && arr[jter]>current_element) {
				arr[jter+1]=arr[jter];
				jter--;
			}
			arr[jter+1]=current_element;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n ; ++i) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr,n);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
