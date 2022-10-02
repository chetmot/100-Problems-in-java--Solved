//Question 20:
//You are playing a game with your friend.
//
//You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:
//
//The number of "corrects", which are digits in the guess that are in the correct position.
//The number of "partials", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-correct digits in the guess that could be rearranged such that they become correct.
//Given the secret number s and your friend's guess g, return the hint for your friend's guess.
//
//The hint should be formatted as "xAyB", where x is the number of "corrects" and y is the number of "Partials". Note that both secret and guess may contain duplicate digits.
//
//Input Format
//
//The first line contains a string of digits denoting the secret s
//
//The second line contains a string of digits denoting the guess g
//
//Constraints
//
//length(s) = length(g) 1 <= length(s) <= 1000
//
//Output Format
//
//Print a string xAyB where x is the number of corrects and y is the number of partials
import java.io.*;
import java.util.*;

public class Secret_Guess {
    
    static String GetHint(String number, String guess) {
        int bulls=0, cows=0;
        int [] numbers = new int[10];
        for(int i=0; i<number.length(); i++) {
            if(number.charAt(i)==guess.charAt(i)) bulls++;
            else {
                if (numbers[number.charAt(i)-'0']++ < 0) cows++;
                if (numbers[guess.charAt(i)-'0']-- > 0) cows++;
            }
        }
        return bulls+"A"+cows+"B";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulls=0, cows=0;
        String number = sc.nextLine();
        String guess = sc.nextLine();
        System.out.println(GetHint(number,guess));
    }
}