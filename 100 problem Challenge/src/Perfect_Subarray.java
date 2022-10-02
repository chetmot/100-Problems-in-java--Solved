//Question 15:
//You are given an array A of n integers. You need to count the subarrays which have the sum of all elements in it a perfect square.
//
//Input Format
//
//The first line contains an integer N that denotes count of elements in the array.
//
//Next line contains N space separated integers that denote elements of the array.
//
//Constraints
//
//1 <= N <= 1000
//
//1 <= A[i] <= 10^9
//
//Output Format
//
//In the output, you need to print the count of subarrays for which the sum of elements is a perfect square.
import java.io.*;
import java.util.*;

public class Perfect_Subarray {
    
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
