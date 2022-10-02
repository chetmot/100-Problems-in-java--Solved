//Question 19:
//You are given a string s which contains digits from 0-9. A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//
//You need to find all the corresponding strings after mapping. You need to print the count of all possible strings for example for given input "225" the strings can be "aaj" or "bj". Therefore you need to output 2
//
//image
//
//Input Format
//
//The first line contains the string s
//
//Constraints
//
//s contains digit from 0-9 except 1
//
//Output Format
//
//Print the count of all possible strings that can be build from the given string using the given mapping
import java.io.*;
import java.util.*;

public class Phone_String {
    
    static double numberOfPossibilities(char s, int count){
        if(s=='7' || s=='9') {
            return Math.pow(2,count-1);
        }
        else {
            if(count>3) return Math.pow(2,count-1)-1;
            else return Math.pow(2,count-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num= sc.nextLine();
        double total=1;
        for(int i=0; i<num.length(); i++){
            int count=1;
            while(i+1<num.length() && num.charAt(i+1)==num.charAt(i)){
                count++;
                i++;
            }
            total=total*numberOfPossibilities(num.charAt(i),count);
        }
        System.out.println((int)total);
    }
}