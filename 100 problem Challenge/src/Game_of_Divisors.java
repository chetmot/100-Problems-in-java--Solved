//Question 49:
//Ramesh and Suresh are playing a game.
//
//They start with a positive integer n and take alternating turns doing operations on it. Each turn a player can subtract from n one of its divisors that isn't 1 or n. The player who cannot make a move on his/her turn loses. Ramesh always moves first.
//
//Note that they subtract a divisor of the current number in each turn.
//
//You are asked to find out who will win the game if both players play optimally.
import java.io.*;
import java.util.*;

public class Game_of_Divisors {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) System.out.println("Ramesh");
        else System.out.println("Suresh");
    }
}
