//Question 11:
//You are given an array A of length n. You need to find the maximum length of the subsequence of A which contains at least one digit common in all the elements of that subsequence. You are not allowed to count leading zeros.
//
//Input Format
//
//The first line of input contains n, denoting the number of elements.
//
//The second line of input contains n space separated integers, denoting array elements.
//
//Constraints
//
//1 <= n <= 10000
//
//1 <= A[i] <= 10^9
//
//Output Format
//
//Print a single integer representing maximum length of subsequence containing at least one common digit .
import java.io.*;
import java.util.*;
public class Longest_Subsequence 
{
    public static int commonDigitLongestSubsequence(int[] arr) {
        int i, j, tem;
        int n = arr.length;
        int[] dp = new int[n];

        int maxLength = 0;

        for (i = 0; i < n; i++) 
        {
            dp[i] = 1;
            tem = arr[i];

            boolean[] digitsOfCurrentNumber = new boolean[10];

            while (tem > 0) 
            {
                int digit = tem % 10;
                digitsOfCurrentNumber[digit] = true;
                tem /= 10;
            }

            for (j = 0; j < i; j++) 
            {
                tem = arr[j];
                while (tem > 0) 
                {
                    int digit = tem % 10;
                
                    if (digitsOfCurrentNumber[digit]) 
                    {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                    
                    tem /= 10;
                }
            }

            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print(commonDigitLongestSubsequence(arr));
    }
}
