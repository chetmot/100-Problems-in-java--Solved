//question 86:
//Given an array length 2 or more of ints, return the difference between the largest and second smallest values in the array.
import java.io.*;
import java.util.*;

public class Big_difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[n-1]-arr[1]);
    }
}