//question 60:
//You are given a string S with length N. Determine if it is possible to find two non-empty strings A and B which satisfy the following conditions:
//
//A+B=S, where + denotes string concatenation
//B is a substring of A
//Note: B is a substring of A if B can be obtained from A by deleting several (possibly zero) characters from the beginning and several (possibly zero) characters from the end. For example, "ab" is a substring of "cabd", but "ad" is not.
//
//Input Format
//
//The first line of input contains a single integer N.
//
//The second line contains a single string S.
//
//Constraints
//
//2≤N≤10^4
//
//|S|=N
//
//S contains only lowercase English letters
//
//Output Format
//
//Print a single line containing the string "YES" if it is possible to find strings A and B satisfying the given conditions or "NO" otherwise.
import java.io.*;
import java.util.*;

public class String_Splitting {
    
    static boolean isSubstring(String s1, String s2) {
        if(s2.indexOf(s1)<0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        sc.nextLine();
        String str=sc.nextLine();
        String str1, str2;
        for(int i=0; i<n; i++){
            str1=str.substring(0, i);
            str2=str.substring(i);
            if(isSubstring(str2,str1)) {
                System.out.println("YES");
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("NO");
    }
}