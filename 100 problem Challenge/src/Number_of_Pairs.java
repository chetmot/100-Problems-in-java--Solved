//Question 35:
//You are given an array a of n integers. Find the number of pairs (i,j) (1 ≤ i < j ≤ n) where the sum of ai+aj is greater than or equal to l and less than or equal to r (that is, l≤ai+aj≤r).
//
//Input Format
//
//The first line contains three integers n,l,r — the length of the array and the limits on the sum in the pair.
//
//The second line contains n integers a1,a2,…,an.
//
//Constraints
//
//1≤n≤1000;
//
//1≤l≤r≤100000;
//
//1≤ai≤10⁶;
//
//Output Format
//
//Output a single integer — the number of index pairs (i,j) (i < j), such that l≤ai+aj≤r
import java.io.*;
import java.util.*;

public class Number_of_Pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, l, r, sum, count=0;
        n= sc.nextInt();
        l= sc.nextInt();
        r= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i=0 ; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                sum= arr[i]+arr[j];
                if(sum<=r && sum>=l){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
