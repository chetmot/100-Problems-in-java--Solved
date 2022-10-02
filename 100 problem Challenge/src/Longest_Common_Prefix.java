//Question 24:
//Given an array of strings A, find the longest common prefix string amongst them.
//
//If there is no common prefix, print -1.
//
//Input Format
//
//The first line contains an integer n denoting the size of array
//
//The next n line contains a string
//
//Constraints
//
//1 <= A.length <= 200 0 <= A[i].length <= 200 A[i] consists of only lower-case English letters.
//
//Output Format
//
//Print the longest common prefix. Print -1 if there is nor common prefix
import java.io.*;
import java.util.*;

public class Longest_Common_Prefix {
    
    static int findMinLength(String arr[], int n)
    {
        int min = arr[0].length();
 
        for (int i = 1; i < n; i++)
        {
            if (arr[i].length() < min)
            {
                min = arr[i].length();
            }
        }
 
        return (min);
    }
    
    static String commonPrefix(String arr[], int n)
    {
        int minlen = findMinLength(arr, n);
 
        String result = ""; 
        char current; 
 
        for (int i = 0; i < minlen; i++)
        {
            current = arr[0].charAt(i);
 
            for (int j = 1; j < n; j++)
            {
                if (arr[j].charAt(i) != current)
                {
                    return result;
                }
            }
 
            result += (current);
        }
 
        return (result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextLine();
        }
        String ans = commonPrefix(arr, n);
        if(ans.length()==0) System.out.print("-1");
        else System.out.print(ans);
    }
}
