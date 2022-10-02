//question 63:
//Four players participate in the playoff tournament. The tournament is held according to the following scheme: the first player will play with the second, and the third player with the fourth, then the winners of the pairs will play in the finals of the tournament.
//
//It is known that in a match between two players, the one whose skill is greater will win. The skill of the i-th player is equal to si and all skill levels are pairwise different (i. e. there are no two identical values in the array s).
//
//The tournament is called fair if the two players with the highest skills meet in the finals.
//
//Determine whether the given tournament is fair.
//
//Input Format
//
//A single line of input contains four integers s1,s2,s3,s4 — skill of the players. It is guaranteed that all the numbers in the array are different.
//
//Constraints
//
//1≤si≤100
//
//Output Format
//
//Output YES if the tournament is fair, or NO otherwise.
import java.io.*;
import java.util.*;

public class Playoff_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skill = new int[4];
        int x, y;
        for(int i= 0; i<4; i++) {
            skill[i]=sc.nextInt();
        }
        if(skill[0]>skill[1]) x=skill[0];
        else x=skill[1];
        
        if(skill[2]>skill[3]) y=skill[2];
        else y=skill[3];
        
        Arrays.sort(skill);
        if((x==skill[3] && y==skill[2]) || (x==skill[2] && y==skill[3])) System.out.print("YES");
        else System.out.print("NO");
    }
}
