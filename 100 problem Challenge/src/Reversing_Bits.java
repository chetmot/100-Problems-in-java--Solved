//Question 6:
//Given a 32 bit integer n, you need to reverse the bits of the integer and print the decimal value of the reversed bits.
//
//Input Format
//
//The first line contains an integer denoting n
//
//Constraints
//
//0<= n<= 2^32 - 1
//
//Output Format
//
//Print a single unsigned integer denoting the decimal value of reversed bits.
import java.util.*;
public class Reversing_Bits {
    
    public static String toBinary(long x) {
        return String.format("%32s", Long.toBinaryString(x)).replaceAll(" ", "0");
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i;
        long sum=0;
        String binary = toBinary(n);
        for(i=0; i<32; i++) {
            sum = (long) (sum + Character.getNumericValue(binary.charAt(i)) * Math.pow(2, i));
        }
        System.out.println(sum);
    }
}
