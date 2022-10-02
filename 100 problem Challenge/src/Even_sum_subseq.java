//question 67:
//You are given an integer N. Consider the sequence containing the integers 1,2,…,N in increasing order (each exactly once). Find the maximum length of its contiguous subsequence with an even sum.
//
//Input Format
//
//First and only line of input contains a single integer N.
//
//Constraints
//
//2≤N≤10^4
//
//Output Format
//
//Print a single line containing one integer --- the maximum length of a contiguous subsequence with even sum.
import java.io.*;
import java.util.*;

public class Even_sum_subseq {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int ans;
        int sum = (n+1)*n/2;
        if(sum%2==0) ans=n;
        else ans=n-1;
        System.out.println(ans);
    }
}
