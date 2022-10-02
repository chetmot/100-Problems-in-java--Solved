//question 88:
//We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
//
//Input Format
//
//The input contains three lines:
//
//First line: Size of the array.
//
//Second line: Elements of the array.
//
//Third line: The "Value" whose presence is identified in the array.
//
//Constraints
//
//2 <= array_size <= 30
//
//Use a function to write the main logic of the code.
//
//Output Format
//
//Prints "true" if the value has "everywhere" presence otherwise it is "false".
import java.io.*;
import java.util.*;

public class Is_everywhere {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i] =sc.nextInt();
        }
        int check=0;
        int key = sc.nextInt();
        for(int i=0; i<n-1; i++) {
            if(arr[i]!=key && arr[i+1]!=key){
                check=1;
                System.out.println("false");
                break;
            }
        }
        if(check==0) System.out.println("true");
    }
}