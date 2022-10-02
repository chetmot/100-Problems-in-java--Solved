//question 66:
//In Dogland, the speed of light is c m/s, and acceleration due to gravity is g m/s2.
//
//Find the smallest height (in meters) from which Dog should jump such that during its journey down only under the effect of gravity and independent of any air resistance, it achieves the speed of light and verifies Einstein's theory of special relativity.
//
//Assume it jumps at zero velocity and at any time, its velocity (v) and depth of descent (H) are related as (v^2)=2⋅g⋅H.
//
//Input Format
//
//First and only line of input contains two integers g, c.
//
//Constraints
//
//1≤g≤10
//
//1000≤c≤3000
//
//2⋅g divides c^2
//
//Output Format
//
//Output in a single line the answer to the problem.
import java.io.*;
import java.util.*;

public class Jumping_dog {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int g = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((c*c)/(2*g));
    }
}
