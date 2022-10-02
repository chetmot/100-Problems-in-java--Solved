//Question 5:
//There are n balls kept in a circle which are marked from 1 to n. Also given is a number k. Every kth ball is taken and thrown out of the circle till only one ball remains i.e (k-1)th balls are skipped in between. Find the number of the ball that remains. Counting starts with ball numbered 1.
//
//Input Format
//
//The first line contains an integer denoting n
//
//The second line contains a integer denoting k
//
//Constraints
//
//1<= n, k <= 15
//
//Output Format
//
//Print the number of the ball that remains after eliminating all other balls
import java.util.*;

public class Winning_Ball {
    
    static int winningBall(int n, int k) {
        if(n==1) return 1;
        else return (winningBall(n-1,k)+ k - 1)%n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(winningBall(n,k));
    }
}