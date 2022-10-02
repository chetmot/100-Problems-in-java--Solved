//question 54:
//You are given N non-negative integers A1,A2,…,AN. You are allowed to perform following operation any number of times:
//
//Choose any valid index i (1≤i≤N) and a positive integer M>0 and replace Ai with (Ai)modM. That is, replace Ai with its remainder when divided by M, which is a value between 0 and M−1, inclusive.
//
//M does not need to be same between different operations. Find the minimum number of operations to make all the array elements equal.
//
//Input Format
//
//The first line contains an integer N - the size of array.
//
//The second line contains N integers A1,A2,…,AN - the elements of the array.
//
//Constraints
//
//1≤N≤10^3
//
//0≤Ai≤10^4
//
//Output Format
//
//Print one line containing an integer which denotes minimum number of operations performed to make all the elements equal.
import java.io.*;
import java.util.*;

public class Modular_Equality {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int Min=0, SecondMin=0, num;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        Min=arr[0];
        int countMin=0;
        for(int i=0; i<n; i++) {
            if(arr[i]!=arr[0]) {
                SecondMin=arr[i];
                break;
            }
            else countMin++;
        }
        if(SecondMin-Min==1) num=n;
        else num=n-countMin;
        System.out.println(num);
    }
}
