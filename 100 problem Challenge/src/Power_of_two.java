//Question 34:
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2^x.
//
//Input Format
//
//The first and only line contains an integer denoting n
//
//Constraints
//
//0 <= n <= 2^31 - 1
//
//Output Format
//
//Print true if n i power of 2 or else print false
import java.io.*;
import java.util.*;

public class Power_of_two {
    
    static boolean ispowerof2(long n) {
        if(n==0) return false;
        while(n!=1){
            if(n%2!=0) return false;
            n =n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(ispowerof2(n)) System.out.println("true");
        else System.out.println("false");
    }
}
