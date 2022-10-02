//question 98:
//Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen.
//
//Input Format
//
//The input contains three lines:
//
//First line: Size of the array.
//
//Second line: Elements of the array.
//
//Third line: The target value
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
//Print "true" if the group can be created, otherwise print "false".
import java.io.*;
import java.util.*;

public class Group_no_adjacent {
    
    static boolean groupNoAdj(int arr[], int start, int target) {
        if(start>=arr.length) {
            return (target==0);
        }
        if(groupNoAdj(arr, start+2, target-arr[start])) return true;
        if(groupNoAdj(arr, start+1, target)) return true;
        return false;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumeven=0, sumodd=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        if(groupNoAdj(arr, 0, target)) System.out.print("true");
        else System.out.print("false");
    }
}
