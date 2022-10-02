//Question 36:
//You have a string s, and you can do two types of operations on it:
//
//Delete the last character of the string.
//Duplicate the string: s:=s+s, where + denotes concatenation.
//You can use each operation any number of times (possibly none).
//
//Your task is to find the lexicographically smallest string of length exactly k that can be obtained by doing these operations on string s.
//
//A string a is lexicographically smaller than a string b if and only if one of the following holds:
//
//a is a prefix of b, but a≠b;
//In the first position where a and b differ, the string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
//Input Format
//
//The first line contains two integers n, k — the length of the original string s and the length of the desired string.
//
//The second line contains the string s, consisting of n lowercase English letters.
//
//Constraints
//
//1≤n,k≤5000
//
//Output Format
//
//Print the lexicographically smallest string of length k that can be obtained by doing the operations on string s.
import java.io.*;
import java.util.*;

public class Delete_Duplicate {
    
    static String removeLast(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        if(n>k){
            str= str.substring(0,k);
            System.out.println(str);
        }
        else if(n==k) {
            System.out.println(str);
        }
        else if(n<k){
            if(str.charAt(0) > str.charAt(1)){
                String ans=str;
                while(str.length()<k-ans.length()){
                    str=str+ans;
                }
                int x=str.length();
                int diff=k-x;
                str=str+ans.substring(0,diff);
                System.out.println(str);
            }
            else {
                str=str.substring(0,1);
                while(str.length()<k){
                    str=str+str.charAt(0);
                }
                System.out.println(str);
            }
        }
    }
}