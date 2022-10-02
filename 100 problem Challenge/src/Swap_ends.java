//question 77:
//Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
//
//Input Format
//
//The input contains 2 lines:
//
//First Line: Size of the int array
//
//Second Line: Elements of the array
//
//Constraints
//
//1 <= array size <= 30
//
//Output Format
//
//Print the resultant array in a single line.
import java.io.*;
import java.util.*;

public class Swap_ends {
    
    static void swapEND(int arr[], int n){
        int t;
        t=arr[n-1];
        arr[n-1]=arr[0];
        arr[0]=t;
        for(int i =0 ; i<n ; ++i){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n ; ++i){
            arr[i]= sc.nextInt();
        }
        swapEND(arr, n);
    }
}
