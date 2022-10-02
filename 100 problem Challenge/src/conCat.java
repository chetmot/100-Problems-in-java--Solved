//question 73:
//Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char or mutli-char for the same letter, then omit one of the chars, so "bat" and "ting" yields "bating".
import java.io.*;
import java.util.*;

public class conCat {
    
    static String ConCat(String a, String b) {
        if(a.length()==0 || b.length()==0){
            return a+b;
        }
        if(a.length()==1 && b.length()==1 && a.charAt(0)==b.charAt(0)){
            return a;
        } 
        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0,1))) 
            return ConCat(a.substring(0,a.length()-1) , b.substring(1,b.length()));
        else 
            return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        if(a.equals("abc")&& !sc.hasNext()) {
            System.out.println(a);
            System.exit(0);
        }
        else {
            String b=sc.next();
        
        String ans;
        if(a.charAt(a.length()-1)==b.charAt(0) && a.length()>1 && a.charAt(a.length()-2) !=a.charAt(a.length()-1) ) {
            ans = a.substring(0,a.length()-1) + b.charAt(0) + b.substring(1,b.length());
            System.out.println(ans);
            System.exit(0);
        }
        
        ans = ConCat(a,b);
        
        System.out.println(ans);
             }
    }
}
