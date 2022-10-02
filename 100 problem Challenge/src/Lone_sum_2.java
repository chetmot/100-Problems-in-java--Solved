//question 70:
//Given an array return their sum. However, if one of the array element is the same as another of the values, it does not count towards the sum.
//
//Input Format
//
//The input has two lines:
//
//First Line: Total Number of interger values.
//
//Second Line: Integer Elements (space separated).
//
//Constraints
//
//1 < array size < 1001
//Output Format
//
//Print the sum value.
import java.io.*;
import java.util.*;

public class Lone_sum_2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i, j, sum=0;
        n=sc.nextInt();
        int[] arr = new int[n];
        int[] frq = new int[n];
        for(i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            frq[i]=0;
        }
        for(i=0; i<n; i++) {
            for(j=0; j<n; j++) {
                if(arr[i]==arr[j]){
                    frq[i]++;
                }
            }
        }
        for(i=0; i<n; i++) {
            if(frq[i]==1){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
