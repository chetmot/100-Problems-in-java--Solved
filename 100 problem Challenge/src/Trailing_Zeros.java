//Question 8:
//Given a number n, find the count of zeros that occurs at the end for factorial of n.
//
//Input Format
//
//The first line contains an integer denoting n
//
//Constraints
//
//1<= n<= 1000
//
//Output Format

//Print the number of count of zeros that occur at the end of factorial n
import java.io.*;
import java.util.*;

public class Trailing_Zeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        while(n>0){
            sum=sum+n/5;
            n=n/5;
        }
        System.out.print(sum);
    }
}
