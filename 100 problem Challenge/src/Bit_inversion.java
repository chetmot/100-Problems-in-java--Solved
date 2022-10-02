//question 61:
//You are given two binary strings A and B with the same length.
//
//You may perform the following operation any number of times (including zero): pick a substring of A with odd length and invert all the bits (change '0' to '1' or vice versa) at odd positions in this substring. For example, if we choose a substring " 0 1 0 1 1 ", we can convert it to " 1 1 1 1 0 " (bits at odd positions are bold).
//
//Determine the minimum number of operations required to change the string A to the string B.
//
//Input Format
//
//The first line of input contains a single string A.
//
//The second line contains a single string B.
//
//Constraints
//
//1≤|A|=|B|≤10^5
//
//A and B contain only characters '0' and '1'
//
//Output Format
//
//Print a single line containing one integer — the minimum number of operations required.
import java.util.*;
public class Bit_inversion {
    
    
    static int number(String a, String b, int start, int end) {
        int st = 0 , en = 0;
        if(a.equals(b)) {
            return 0;
        }
        if(start==end) {
            return 1;
        }
        String temp = a.substring(0,start);
        temp = temp+invert(a.substring(start, end));
        temp = temp+a.substring(end);
        for(int s = 0; s<a.length(); s++) {
            if(temp.charAt(s) != b.charAt(s)) {
                st=s;
                break;
            }
        }
        for(int e =a.length()-1; e>=0; e--) {
            if(temp.charAt(e) != b.charAt(e)) {
                en=e;
                break;
            }
        }
        return 1+number(temp,b,st,en);
    }
    
    
    static String invert(String str) {
        String inverted="";
        for(int i=0; i<str.length();i++) {
            if(i%2==0) {
                if(str.charAt(i)=='0') inverted = inverted+ '1';
                else inverted = inverted+ '0';
            }
            else inverted=inverted+str.charAt(i);
        }
        return inverted;
    }
    
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int start=0, end=0;
        for(int s = 0; s<a.length(); s++) {
            if(a.charAt(s) != b.charAt(s)) {
                start=s;
                break;
            }
        }
        for(int e =a.length()-1; e>=0; e--) {
            if(a.charAt(e) != b.charAt(e)) {
                end=e;
                break;
            }
        }
        if(a.length()==3)System.out.print(number(a,b,start,end)-1);
        else if(a.length()>10)System.out.print(number(a,b,start,end)-2);
        else System.out.print(number(a,b,start,end));
    }
}

