//Question 1: 
//Given an array of integers, A of size n, find the second largest element in the array in a single pass i.e traverse the array only once.
//
//Input Format
//
//The first line contains an integer n
//
//The next line contains n integers separated by space denoting the array elements
//
//Constraints
//
//-10^9 <= A[i] <= 10^9
//
//Output Format
//
//Print the second largest element in the array
import java.util.*;
import java.util.Arrays;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n=sc.nextInt();
        int []arr= new int[n];
        for(i=0; i<n;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=n-2; i>=0; i--) {
            if(arr[i] != arr[n-1]) {
                System.out.println(arr[i]);
                break;
            }
        }
        
    }
}
