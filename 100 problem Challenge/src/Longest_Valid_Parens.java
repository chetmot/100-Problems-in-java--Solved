//question 48:
//Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
import java.io.*;
import java.util.*;

public class Longest_Valid_Parens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length=0, countleft=0, countright=0, max=0, original=0, j=0;
        for(int i=0; i<str.length(); i++){
            length=0;
            countleft=0;
            countright=0;
            if(str.charAt(i)=='('){
                original=i;
                j=i;
                while(j<str.length()){
                    if(str.charAt(j)=='(') {
                        length++;
                        countleft++;
                    }
                    if(str.charAt(j)==')'){
                        length++;
                        countright++;
                    }
                    if(countleft==countright){
                        if(length>max) max=length;
                    }
                    if(countright>countleft){
                        break;
                    }
                    j++;
                }
            }
        }
        System.out.println(max);
    }
}
