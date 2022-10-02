////question 97:
//Given a input string, compute recursively (no loops) the number of times lowercase "ab" appears in the string.
//
//Input Format
//
//The first line contains a positive integer t that indicates the number of test cases. Each test case is represented in a single line consists of String str.
//
//Constraints
//
//2<= String_Size <=100
//
//1<= t <= 50
//
//Output Format
//
//The result i.e. the count of substring occurrence of each test case need to be printed in a different line.
import java.io.*;
import java.util.*;

public class Count_substring_occurence {
    
    static int countSubstring(String str1,String str2) {
    int n1 = str1.length();
    int n2 = str2.length();
    if (n1 == 0 || n1 < n2)
        return 0;
    if (str1.substring(0, n2).equals(str2))
        return countSubstring(str1.substring(1),str2) + 1;
    return countSubstring(str1.substring(1),str2);
    }
    
    static int CountOccurences(String str){
        int x=0,i=0;
        for(i=1; i<str.length(); i++){
            if(str.charAt(i)=='b' && str.charAt(i-1)=='a'){
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String str, sub="ab";
        while(t>0){
            t=t-1;
            str = sc.nextLine();
            System.out.println(countSubstring(str,sub));
            
        }
    }
}