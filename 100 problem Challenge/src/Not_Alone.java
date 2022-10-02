//question 87:
//We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
//
//Input Format
//
//The input contains 3 lines:
//
//First Line: Size of the array
//
//Second Line: Elements of the array
//
//Third Line: One of the element (key) from the array.
//
//Constraints
//
//2 <= array size <= 30
//
//The key must be an element from the array.
//
//Output Format
//
//Print the modified array in a single line (space separated)
import java.io.*;
import java.util.*;

public class Not_Alone {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        for(int i=0; i<n; i++) {
            if(i==n-1 || i==0) arr[i]=arr[i];
            else if(arr[i]==key){
                if(arr[i+1] != key && arr[i-1] != key) {
                    arr[i] = Math.max(arr[i-1],arr[i+1]);
                }
            }
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
