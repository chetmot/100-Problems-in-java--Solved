//Question 26:
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
//
//Input Format
//
//The first and only line contains the string s
//
//Constraints
//
//1 <= s.length <= 10^5
//
//s consist of printable ASCII characters.
//
//Output Format
//
//Print the string with reversed vowels
import java.io.*;
import java.util.*;

public class Reverse_Vowels {
    
    static boolean checkVowel(char s) {
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String vowels="", answer="";
        int l=str.length();
        for(int i=0; i<l; i++){
            if(checkVowel(str.charAt(i))) vowels=str.charAt(i)+vowels;
        }
        int k=0;
        for(int i=0; i<l; i++){
            if(checkVowel(str.charAt(i))) {
                answer+=vowels.charAt(k);
                k++;
            }
            else {
                answer+=str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}