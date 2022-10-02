//question 94:
//We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
//
//Input Format
//
//The input consists of a two lines:
//
//First Line: Size of the array
//
//Second Line: Elements of the array
//
//Constraints
//
//2 <= Size of the array <=100
//
//Output Format
//
//Print the length of largest subarray whose mirror exists in the input array.
import java.util.*;
public class Max_mirror {
	
	static boolean isEqual(int subarr[], int revsubarr[], int size) {
		for(int i=0; i<size; i++) {
			if(subarr[i] != revsubarr[i]) {
				return false;
			}
		}
		return true;
	}
	
	static int[] subarray(int arr[], int n,int start, int size) {
		int[] sub = new int[size];
		for(int i=start, j=0; i<start+size; i++, j++) {
			sub[j] = arr[i];
		}
		return sub;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length =0, max = 0;
		int n = sc.nextInt();
		int[] arr= new int[n];
		int[] revarr= new int[n]; 
		for(int i=0;i<n; i++) {
			arr[i]=sc.nextInt();
			revarr[n-i-1] = arr[i];
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i]==revarr[j]) {
					length=1;
					for(int x=i,y=j; x<n && y<n; x++, y++ ) {
						if(arr[x]==revarr[y]) length++;
						else break;
					}
					if(max<length) max=length;
				}
			}
		}
		System.out.println(max-1);
	}
}

