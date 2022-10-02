//question 92:
//Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array.
//
//For example:
//
//maxSpan([ 1, 2, 1, 1, 3]) → 4
//
//For the element "1", we are getting the highest span of 4 (position 0 to 3). For "2" & "3", we cannot get a span since, they do not have any rightmost appearence.
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
//The output will be a single line, consists of an integer depicting the maximum span present in an input array.
import java.io.*;
import java.util.*;

public class Max_Span {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int span=0, max=0;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(arr[i]==arr[j]){
                    span=j-i+1;
                }
                if(max<span) max =span;               
            }
        }
        System.out.print(max);
    }
}
