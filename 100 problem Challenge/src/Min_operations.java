//question 58:
//Given a sequence of positive integers A1,A2,…,AN.
//
//You may perform the following operation any number of times (possibly zero):
//
//Choose any element of the current sequence and replace it by any positive integer.
//You need to make the sum of the elements of the sequence divisible by a given positive integer K. Find the minimum number of operations you need to perform to achieve this.
//
//Input Format
//
//The first line of each test case contains two space-separated integers N and K.
//
//The second line contains N space-separated integers A1,A2,…,AN.
//
//Constraints
//
//1≤N≤100
//
//1≤K≤10^5
//
//1≤Ai≤10^5 for each valid i
//
//Output Format
//
//Print a single line containing one integer ― the minimum required number of operations.
import java.io.*;
import java.util.*;

public class Min_operations {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=0, sum=0;
        for(int i=0; i<n; i++) {
            x=sc.nextInt();
            sum+=x;
        }
        if(sum%k==0) System.out.println("0");
        else System.out.println("1");
    }
}
