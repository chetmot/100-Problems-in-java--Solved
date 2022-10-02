//question 59:
//There are N integers in an array A.
//
//Two players take turns alternatively in placing signs (+ or -) before them, and then they all are added. The sign can be placed before any element of the array that has not been assigned a sign yet. All elements must be assigned a sign.
//
//Player 1 wins if the resulting sum is even, else player 2 wins. Find out who shall win if they both play optimally.
//
//Input Format
//
//First line contains a single integer N, size of the array.
//
//Second line contains N space separated integers - A1,A2,…,AN, denoting the array elements.
//
//Constraints
//
//1≤N≤10^3
//
//1≤Ai≤10^4
//
//Output Format
//
//Output in a single line "1", if the first person wins or "2" if the second person wins.
import java.io.*;
import java.util.*;

public class Addition_Game {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int x=0, sum=0;
        for(int i=0; i<n; i++) {
            x=sc.nextInt();
            sum+=x;
        }
        if(sum%2==0) System.out.println("1");
        else System.out.println("2");
    }
}
