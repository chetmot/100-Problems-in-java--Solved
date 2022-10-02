//question 64:
//An array b of length k is called good if its arithmetic mean is equal to 1. More formally, if
//
//(b1+⋯+bk)/k=1.
//
//Note that the value (b1+⋯+bk)/k is not rounded up or down. For example, the array [1,1,1,2] has an arithmetic mean of 1.25, which is not equal to 1.
//
//You are given an integer array a of length n. In an operation, you can append a non-negative integer to the end of the array. What's the minimum number of operations required to make the array good?
//
//Input Format
//
//The first line of input contains a single integer n — the length of the initial array a.
//
//The second line contains n integers a1,…,an , the elements of the array
//
//Constraints
//
//1≤n≤50
//
//−10^4≤ai≤10^4
//
//Output Format
//
//Output a single integer — the minimum number of non-negative integers you have to append to the array so that the arithmetic mean of the array will be exactly 1.
import java.io.*;
import java.util.*;

public class Mean_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0, x;
        for(int i=0; i<n; i++) {
            x= sc.nextInt();
            sum+=x;
        }
        if(sum==n) System.out.println("0");
        else if(sum>n) System.out.println(sum-n);
        else System.out.println("1");
    }
}