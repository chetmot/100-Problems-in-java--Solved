//Question 16:
//You are given an array A consisting of N integers. You need to determine whether there exist a integer K < N for which all subarrays of size K has equal sum.
//
//Input Format
//
//The first line consist of a integer N The second line consist of N space seperated integers denoting array elements.
//
//Constraints
//
//1 <= N <= 1000 1 <= A[i] <= 10^9
//
//Output Format
//
//Print the value of largest value of K if it exists otherwise print 0
import java.util.*;

public class Subarray_Sum {
    
    static double sum(int arr[], int i, int j){
        double sum=0;
        for(int x=i; x<=j; x++){
            sum=sum+arr[x];
        }
        return sum;
    }
    
    static boolean checkPerfectSquare(double n) {
        double sqrt=Math.sqrt(n);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double sum;
        int count=0;
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                sum=sum(arr, i, j);
                if(checkPerfectSquare(sum)) count++;
            }
        }
        System.out.println(count);
    }
}

