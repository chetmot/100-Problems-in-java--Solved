//question 68:
//Given n int values array, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if a number is 13, then including 13 other numbers coming after do not count.
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
//Negative Numbers are also considered in int values.
//-13 (minus 13) is also not considered for the sum.
//Output Format
//
//Print the sum value.
import java.io.*;
import java.util.*;

public class Lucky_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0, sum=0;
        while(n>0){
            n=n-1;
            x=sc.nextInt();
            if(x==13 || x==-13) break;
            sum+=x;
        }
        System.out.println(sum);
    }
}
