//question 69:
//Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
//
//Input Format
//
//Single line of input with three interger values (space separated).
//
//Constraints
//
//No Constraints.
//
//Output Format
//
//Print the sum.
import java.io.*;
import java.util.*;

public class Lone_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, sum;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        
        if(a==b && b==c) sum=0;
        else if(a==b) sum=c;
        else if(a==c) sum=b;
        else if(b==c) sum=a;
        else sum=a+b+c;
        System.out.println(sum);
    }
}
