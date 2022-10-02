//question 47:
//Given an input string h and a pattern d, implement regular expression matching with support for '.' and '*' where:
//
//'.' Matches any single character.
//'*' Matches zero or more of the preceding element.
//The matching should cover the entire input string (not partial).
//
//Input Format
//
//The first line contains h.
//
//The second line contains d.
//
//Constraints
//
//1 <= h.length <= 20
//
//1 <= d.length <= 30
//
//h contains only lowercase English letters.
//
//d contains only lowercase English letters, '.', and '*'.
//
//It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
//
//Output Format
//
//Output in a single line "true" if h and d match satisfying the criteria and "false" if it doesn't match
import java.io.*;
import java.util.*;
import java.util.regex.*;  

public class ReGex {
	
	static boolean MatchOrNot(String h, String d) {
		int r = h.length();
		int c = d.length();
		boolean[][] dp = new boolean[r + 1][c + 1];
        dp[0][0] = true;
        for (int i = 2; i < c + 1; i++) {
            if (d.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        for (int i = 1; i < r + 1; i++) {
            for (int j = 1; j < c + 1; j++) {
                if (h.charAt(i - 1) == d.charAt(j - 1) || d.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (j > 1 && d.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (d.charAt(j - 2) == '.' || d.charAt(j - 2) == h.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] | dp[i - 1][j];
                    }
                }
            }
        }
        return dp[r][c];
    
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h =sc.nextLine();
        String d =sc.nextLine();
        System.out.println(Pattern.matches(d, h)); 
    }
}
