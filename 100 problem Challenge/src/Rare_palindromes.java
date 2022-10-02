//question 52:
//A string is called a Rare(Rearrangeable) Palindrome string if it can be divided into contiguous substrings such that:
//
//Each character of the whole string belongs to exactly one substring.
//Each of these substrings is a palindrome with length greater than 1.
//For example, "abbbaddzcz" is a Palpal string, since it can be divided into "abbba", "dd" and "zcz".
//
//You are given a string s. You may rearrange the characters of this string in any way you choose. Find out if it is possible to rearrange them in such a way that you obtain a Rare Palindrome string.
//
//Input Format
//
//The first and only line of input contains a single string s
//
//Constraints
//
//1≤|s|≤100
//
//s contains only lowercase English letters
//
//Output Format
//
//Print a single line containing the string "YES" if the characters of s can be rearranged to form a rare palindrome string or "NO" if it is impossible
import java.io.*;
import java.util.*;

public class Rare_palindromes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] frq = new int[str.length()];
        int[] arr = new int[str.length()];
        
        for(int i=0; i<str.length(); i++) {
            arr[i]=0;
            frq[i]=0;
        }
        for(int i=0; i<str.length(); i++) {
            if(arr[i]==0){
                frq[i]++;
                for(int j=i+1; j<str.length(); j++) {
                    if(str.charAt(i)==str.charAt(j)){
                        arr[j]=-1;
                        frq[i]++;
                    }
                }
            }
        }
        int one=0, other=0;
        for(int i=0; i<str.length(); i++){
            if(frq[i]==1) one++;
            else if(frq[i]>1) other++;
        }
        if(one>other) System.out.println("NO");
        else System.out.println("YES");
        
    }
}
