//question 57:
//A Rightwise Circular Rotation of a string abcd:
//
//dabc
//cdab
//bcda
//abcd
//You are given a String S consisting of 0’s and 1’s, find whether there exists a rightwise circular rotation of the string such that every 2 adjacent 1′s are separated by at most K 0′s.
//
//Note: The last occurrence of 1 in the rotated string won't have any 1 next to it, i.e, first and the last ones in the string are not considered to be adjacent.
//
//Input Format
//
//First line contains two space separated integers N,K, length of the string and the upper limit on a number of 0′s between 2 adjacent 1′s.
//
//Second line contains the binary string S.
//
//Constraints
//
//S∈{0,1}
//
//1≤N≤10^3
//
//0≤K≤max(0,N−2)
//
//Output Format
//
//Output in a single line "YES" if there exists a rightwise circular rotation of string satisfying the criteria and "NO" if it doesn't exist.
import java.io.*;
import java.util.*;

public class Circular_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,count=0, check=0;
        String str;
        n=sc.nextInt();
        k=sc.nextInt();
        sc.nextLine();
        str=sc.nextLine();
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)=='1' && str.charAt(j)=='1'){
                    count=j-i-1;
                    if(count<=k) check=1;
                    break;
                }                
            }
        }
        if(check==1) System.out.println("YES");
        else System.out.println("NO");

    }
}
