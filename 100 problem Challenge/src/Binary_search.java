//question 91:
//Write a Java program to find an element using binary search.
//
//Note: Read about binary search method if you don’t know about it. Click Here
//
//Input Format
//
//The input should be accepted in the following manner:
//
//First line: Size of an array
//
//Second line: Elements of the array
//
//Third line: key - the number which you are going to find in the array.
//
//e.g. 5
//
//5 1 3 4 2
//
//3
//
//Constraints
//
//Sort the array before applying binary search.
//
//Please write your own code. Do not copy from other sources.
//
//Output Format
//
//Output should be produced the location of the element if found. Otherwise print "Not Found"
//
//2 - Position of the key after sorting the array. Array position starts from 0.

import java.util.*;

public class Binary_search {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Arrays.sort(arr);
        if(Arrays.binarySearch(arr,x)<0) System.out.println("Not Found");
        else System.out.println(Arrays.binarySearch(arr,x));
    }
}

