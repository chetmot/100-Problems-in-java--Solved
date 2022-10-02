//question 96:
//Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
//
//Input Format
//
//The input contains two lines:
//
//First line: Size of the array.
//
//Second line: Elements of the array.
//
//Constraints
//
//You must use recursion to solve this problem.
//
//2 <= array_size <= 30
//
//Loop can be used to take the user input. Apart from that, loops cannot be used.
//
//Output Format
//
//Print "true" if the split can be done, otherwise print "false".
import java.io.*;
import java.util.*;

public class Split_array_recursion {  
    
    static boolean SplitArrayHelper(int arr[], int start, int subarr1, int subarr2){
        if(start >= arr.length)
            return subarr1 == subarr2;
            
        if(SplitArrayHelper(arr,start+1, subarr1 + arr[start], subarr2))
            return true;
                      
        if(SplitArrayHelper(arr,start+1, subarr1, subarr2 + arr[start]))
            return true;
                                
        return false;
    }
    
    static boolean SplitArray(int arr[]) {
        return SplitArrayHelper (arr,0,0,0);        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0 ;i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print(SplitArray(arr));
    }
}
