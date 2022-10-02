//Question 23:
//Given a string s, compress it using the following algorithm:
//
//Begin with an empty string s'. For each group of consecutive repeating characters in s:
//
//If the group's length is 1, append the character to s.
//Otherwise, append the character followed by the group's length.
//After you are done modifying the input string s, return the length of the new string s'.
//
//Input Format
//
//The first line contains a string s
//
//Constraints
//
//1 <= s.length <= 2000 s[i] is a lowercase English letter, digit, or symbol.
//
//Output Format
//
//Output the length of the compressed string according to the algorithm
import java.io.*;
import java.util.*;

public class String_Compress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String comp="";
        for(int i=0; i<str.length(); i++){
            int count=1;
            while(i+1<str.length() && str.charAt(i+1)==str.charAt(i)){
                count++;
                i++;
            }
            if(count!=1) comp=comp+count+str.charAt(i);
            else comp=comp+str.charAt(i);
        }
        System.out.println(comp.length());
    }
}
