//Question 12:
//You are given an integer array A of size n. You need to sort the array in accordance with the priority given by another array called P of same size n. The element P[i] gives the priority for the element A[i]. The higher the value of P[i], the higher is its priority. For example if P[i] > P[j] for some 0 <= i, j <= n and i not equal to j, then A[i] will come before A[j] in the sorted array.
//
//Input Format
//
//The first line of input contains n, denoting the number of elements.
//
//The second line of input contains n space separated integers, denoting array A.
//
//The third line of input contains n space separated integers, denoting array P.
//
//Constraints
//
//1 <= n <= 1000
//
//1 <= A[i], P[i] <= 10^9
//
//Output Format
//
//Print a single line containing n space separated integers denoting the sorted array with the given priority
import java.io.*;
import java.util.*;

public class Priority_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        int p;
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            p = sc.nextInt();
            ans[n-p]=arr[i];
        }
        for(int i=0; i<n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
