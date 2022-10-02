//question 100:
//Given two big integers, write a program to find the sum of those big integers.
import java.io.*;
import java.util.*;

public class Big_Int_Add {
    
    public static String removeFirst(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        return sb.toString();
    }
    
    static String BigSum(String num1, String num2) {
        if(num1.length() > num2.length()) {
            String t = num1;
            num1 = num2; 
            num2 = t;
        }
        String sum="";
        int n1 = num1.length(), n2 = num2.length();
        
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        
        int carry = 0; 
        for(int i=0; i<n1; i++) {
            int s = ((int)(num1.charAt(i) - '0') +(int)(num2.charAt(i) - '0') + carry);
            sum += (char)(s % 10 +'0');
            carry = s/10;
        }
        
        for (int i = n1; i < n2; i++) {
            int s = ((int)(num2.charAt(i) - '0') + carry);
            sum += (char)(s % 10 + '0');
            carry = s / 10;
        }
        
        if (carry > 0) {
            sum += (char)(carry + '0');
        }
        sum = new StringBuilder(sum).reverse().toString();
        
        for(int i =0; i< sum.length()-1; ) {
            if(sum.charAt(i)=='0'){
                sum= removeFirst(sum);
            }
            else {
                break;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String num1, num2;
        while(n>0) {
            n=n-1;
            num1=sc.next();
            num2=sc.next();
            System.out.println(BigSum(num1, num2));
        }
    }
}