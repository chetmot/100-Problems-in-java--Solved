//Question 13:
//Suppose we have a sequence of non-negative integers, Namely a_1, a_2, ... ,a_n. At each time we can choose one term a_i with 0 < i < n and we subtract 1 from both a_i and a_i+1. We wonder whether we can get a sequence of all zeros after several operations.
//
//Input Format
//
//The first line of test case is a number N.
//
//The next line is N non-negative integers
//
//Constraints
//
//0 < N <= 10000
//
//0 <= a_i <= 109
//
//Output Format
//
//If it can be modified into all zeros with several operations output “YES” in a single line, otherwise output “NO” instead.
import java.io.*;
import java.util.*;

public class Array_Operation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        int check=0;
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++) {
            if(arr[i] != 0 && arr[i+1] != 0 ){
                while(arr[i]>0){
                    arr[i]= arr[i]-1;
                    arr[i+1]=arr[i+1]-1;
                }
            }
        }
        for(int i=0; i<n; i++) {
            if(arr[i] != 0){
                check=1;
            }
        }
        if(check==1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
