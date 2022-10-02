//question 65:
//You are given a multiset (i. e. a set that can contain multiple equal integers) containing 2n integers. Determine if you can split it into exactly n pairs (i. e. each element should be in exactly one pair) so that the sum of the two elements in each pair is odd (i. e. when divided by 2, the remainder is 1).
//
//Input Format
//
//The first line of each test case contains an integer n .
//
//The second line of each test case contains 2n integers a1,a2,…,a2n — the numbers in the set.
//
//Constraints
//
//1≤n≤100
//
//0≤ai≤100
//
//Output Format
//
//Print "Yes" if it can be split into exactly n pairs so that the sum of the two elements in each pair is odd, and "No" otherwise
import java.io.*;
import java.util.*;

public class Array_Splitting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, odd=0, even=0;
        for(int i = 0; i<2*n; i++){
            x = sc.nextInt();
            if(x%2==0) even++;
            else odd++;
        }
        if(odd==even) System.out.println("Yes");
        else System.out.println("No");
    }
}
