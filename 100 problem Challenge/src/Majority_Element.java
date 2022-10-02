//Question 32:
//Given an array A of size n, return the majority element.
//
//The majority element is the element that appears more than floor(n / 2) times. You may assume that the majority element always exists in the array.
//
//Input Format
//
//The first line contains an integer denoting n
//
//The next line contains n space separated intger denoting elements of the array A
//
//Constraints
//
//1 <= n <= 10^4 -10^9 <= A[i] <= 10^9
//
//Output Format
//
//Print the majority element
import java.io.*;
import java.util.*;  
 
public class Majority_Element {

    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; 
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > n / 2)
            System.out.println(arr[index]);
 
        else
            System.out.println("-1");
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; ++i){
            arr[i]= sc.nextInt();
        }
        findMajority(arr, n);
    }

}
