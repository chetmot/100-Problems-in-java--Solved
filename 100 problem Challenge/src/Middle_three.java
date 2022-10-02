//question 74:
//If a string is of odd length, return the string length 3 from its middle, so "field" yields "iel". The string length will be at least 3.
//
//Input Format
//
//Single line of Input for input string.
//
//Constraints
//
//3 <= String Length <= 1000
//
//Output Format
//
//If the string length is odd, print the middle substring of length 3.
//
//If the string length is even, print " false".
import java.io.*;
import java.util.*;

public class Middle_three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        if(l%2==1){
            System.out.println(str.substring(l/2-1,l/2+2 ));
        }
        else {
            System.out.println("false");
        }
    }
}
