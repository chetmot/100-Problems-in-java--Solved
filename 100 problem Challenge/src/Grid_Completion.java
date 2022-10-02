//question 62:
//Alice has a grid with 2 rows and n columns. She fully covers the grid using n dominoes of size 1×2 — Alice may place them vertically or horizontally, and each cell should be covered by exactly one domino.
//
//Now, she decided to show one row of the grid to Bob. Help Bob and figure out what the other row of the grid looks like!
//
//Input Format
//
//The first line contains an integer n — the width of the grid.
//
//The second line of each test case contains a string s consisting of n characters, each of which is either L, R, U, or D, representing the left, right, top, or bottom half of a domino, respectively. This string represents one of the rows of the grid.
//
//Constraints
//
//1≤n≤100
//
//String contains only - L, R, U, D
//
//Output Format
//
//Output one string — the other row of the grid, using the same format as the input string.
import java.io.*;
import java.util.*;

public class Grid_Completion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String top= sc.nextLine();
        for(int i=0; i<n; i++){
            if(top.charAt(i)=='L') System.out.print("L");
            else if(top.charAt(i)=='R') System.out.print("R");
            else if(top.charAt(i)=='D') System.out.print("U");
            else if(top.charAt(i)=='U') System.out.print("D");
        }
    }
}
