//question 93:
//Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//Input Format
//
//The input consists of a two lines:
//
//First Line: Size of the array
//
//Second Line: Elements of the array
//
//Constraints
//
//Size of the array: 1 <= length <= 100
//
//Output Format
//
//Print "true" if the there is a possibility of split, otherwise print "false".
import java.io.*;
import java.util.*;

public class Can_Balance {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int right=0, left=0, check=0;
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
            right+=arr[i];
        }
        for(int i=0; i<n; i++){
            left+=arr[i];
            right-=arr[i];
            if(left==right) {
                check=1;
                break;
            }
        }
        if(check==1) System.out.println("true");
        else System.out.println("false");
    }
}
