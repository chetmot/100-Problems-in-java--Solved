//Question 30:
//Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n. If there are no two adjacent 1's, return 0.
//
//Two 1's are adjacent if there are only 0's separating them (possibly no 0's). The distance between two 1's is the absolute difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.
import java.io.*;
import java.util.*;

public class Binary_Distance {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x=0, len;
        String bin = Integer.toBinaryString(n);
        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i)=='1') {
                for(int j=i+1; j<bin.length(); j++) {
                    if(bin.charAt(i)==bin.charAt(j)){
                        len=j-i;
                        if(len>x){
                            x=len;
                        }
                        break;
                    }
                }
            }            
        }
        System.out.print(x);
    }
}
