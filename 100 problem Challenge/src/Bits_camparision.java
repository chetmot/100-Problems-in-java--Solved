//question 55:
//You are given three non-negative integers X, Y and N. Find the number of integers Z such that 0≤Z≤N and (X⊕Z)<(Y⊕Z), where ⊕ denotes the bitwise XOR operation.
//
//Input Format
//
//The first and only line of input contains three space-separated integers X, Y and N.
//
//Constraints
//
//0≤X,Y,N≤10^4
//
//Output Format
//
//Print a single line containing one integer ― the number of integers Z which satisfy all conditions.
import java.io.*;
import java.util.*;

public class Bits_camparision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,n,count=0;
        x=sc.nextInt();
        y=sc.nextInt();
        n=sc.nextInt();
        for(int i=0; i<=n; i++){
            if((x ^ i) < (y ^ i)) count++;
        }
        System.out.println(count);
    }
}

