// Question 1: 
//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (7 inches each). Return true if it is possible to make the goal by choosing from the given bricks. Write a java program to check whether the bricks are sufficient to create a row of bricks of certain length.
//
//Input Format
//
//Input will take three values in a single line (space separated)
//
//1) Number of Small Bricks (Size = 1 inch)
//
//2) Number if Big Bricks (Size = 7 inches)
//
//3) Length of the Brick Row (in Inches)
//
//Example:
//
//4 5 20
//
//Here, one have 4 small bricks and 5 big bricks and they have to create a brick row of 20 inches long.
//
//Constraints
//
//No Constraints
//
//Output Format
//
//Output will have two values either True or False.

import java.util.*;  
public class Arrange_Bricks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = sc.nextInt();
        int ans, quotient, remainder, diff;
        remainder = l % 7;
        quotient = l / 7;
        if (b >= quotient && a >= remainder) {
            ans = 1;
        } else if (b < quotient) {
            diff = quotient - b;
            if (a >= diff * 7 + remainder) {
                ans = 1;
            } else {
                ans = 0;
            }
        } else {
            ans = 0;
        }
        if (ans == 1) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}