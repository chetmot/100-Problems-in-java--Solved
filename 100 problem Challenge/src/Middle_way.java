//question 76:
//Given 2 int arrays, a and b, of odd number length, return a new array of length 2 containing their middle elements.
//
//Input Format
//
//The input contains 3 lines:
//
//1) First Line: 2 input space separated (size of array 1, size of array 2)
//
//2) Second Line: Elements of first array
//
//3) Third Line: Elements of second array
//
//Constraints
//
//Size of the arrays must be odd.
//
//Output Format
//
//Print the array containing 2 elements in a single line (space separated).
import java.io.*;
import java.util.*;

public class Middle_way {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1= sc.nextInt();
        int l2= sc.nextInt();
        int count=1, m1=0, m2=0, x;
        while(count<=(l1+l2)){
            x = sc.nextInt();
            if(count==(l1+1)/2) m1=x;
            else if(count == l1 +(l2+1)/2) m2=x;
            count=count+1;
        }
        System.out.println(m1+" "+m2);
    }
}
