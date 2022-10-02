//question 72:
//Given a string, return true if "run" appears starting at index 0 or 1 in the string, such as with "runxxx" or "xrunxx" but not "xxrunxx". The string may be any length, including 1.
//
//Input Format
//
//Single line of input string.
//
//Constraints
//
//1 <= String_length <=1000
//
//Output Format
//
//Print true/false.
import java.io.*;
import java.util.*;

public class hasRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()<3){
            System.out.println("false");
        }
        else if(str.charAt(0)=='r' && str.charAt(1)=='u' && str.charAt(2)=='n'){
            System.out.println("true");
        }
        else if(str.charAt(1)=='r' && str.charAt(2)=='u' && str.charAt(3)=='n'){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
