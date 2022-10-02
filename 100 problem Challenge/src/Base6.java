//Question 29:
//Given an integer n in decimal, return a string of its base 6 representation.
import java.io.*;
import java.util.*;

public class Base6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r[]= new int[6];
        int i=0;
        while(n>0){
            r[i]=n%6;
            n=n/6;
            i=i+1;
        }
        while(i>0){
            System.out.print(r[i-1]);
            i=i-1;
        }
    }
}