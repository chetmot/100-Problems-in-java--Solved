//Question 28:
//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "hello".
//Only the first letter in this word is capital, like "Google".
//Given a string s, return true if the usage of capitals in it is right.
import java.io.*;
import java.util.*;

public class Correct_Capital {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        if(str.charAt(0)<91 && 64<str.charAt(0)) System.out.println("true");
        else if(str.length()==1) System.out.println("true");
        else System.out.println("false");
    }
}