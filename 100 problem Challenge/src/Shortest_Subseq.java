//question 56:
//You have a binary string s of length N.
//
//What is the length of the shortest subsequence of s that needs to be erased for the resulting string to be non-decreasing?
//
//Input Format
//
//The first line of input contains a single integers N.
//
//The second line contains a single string s of length N.
//
//Constraints
//
//1≤N≤10^5
//
//Every character in every string is either 0 or 1
//
//Output Format
//
//Print a single line containing one integer − the length of the shortest subsequence that
import java.io.*;
import java.util.*;

public class Shortest_Subseq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min=0;
        sc.nextLine();        
        String bin = sc.nextLine();
        for(int i=0; i<n; i++){
            if(bin.charAt(i)=='1') min++;
        }
        int count=min;
        for(int i=n-1; i>=0; i--) {
            if(bin.charAt(i)=='0') count++;
            else count--;
            if(min>count) min=count;
        }
        System.out.print(min);
        
    }
}
