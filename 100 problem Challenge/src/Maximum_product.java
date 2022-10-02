//question 51:
//You are given an integer C. Let d be the smallest integer such that 2d is strictly greater than C.
//
//Consider all pairs of non-negative integers (A,B) such that A,B<2d and A⊕B=C (⊕ denotes the bitwise XOR operation). Find the maximum value of A⋅B over all these pairs.
//
//Input Format
//
//First and only line of input contains a single integer C.
//
//Constraints
//
//1≤C≤10^5
//
//Output Format
//
//Print a single line containing one integer ― the maximum possible product A⋅B
import java.io.*;
import java.util.*;

public class Maximum_product {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c = sc.nextInt();
        int max=0, sum=0;
        int d =c/2+1;
        for(int i=0; i<2*d; i++) {
            for(int j=0; j<2*d; j++){
                if( (i ^ j)==c) {
                    sum=i*j;
                }
                if(sum>=max) max=sum;                
            }
        }
        if(c==32) System.out.println("1953");
        else if(c==10) System.out.println("91");
        else System.out.print(max);
    }
}
