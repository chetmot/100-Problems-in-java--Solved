//Question 44:
//There's a table of n×m cells (n rows and m columns). The value of n⋅m is even.
//
//A domino is a figure that consists of two cells having a common side. It may be horizontal (one of the cells is to the right of the other) or vertical (one of the cells is above the other).
//
//You need to find out whether it is possible to place (nm)/2 dominoes on the table so that exactly k of them are horizontal and all the other dominoes are vertical. The dominoes cannot overlap and must fill the whole table.
//
//Input Format
//
//First and only line of input contains three integers n, m, k () — the number of rows, columns and horizontal dominoes, respectively
//
//Constraints
//
//1≤n,m≤100
//
//0≤k≤(nm)/2
//
//n⋅m is even
//
//Output Format
//
//Output "YES", if it is possible to place dominoes in the desired way, or "NO" otherwise
import java.io.*;
import java.util.*;

public class Domino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, verticle, horizontal;
        n=sc.nextInt();
        m=sc.nextInt();
        horizontal=sc.nextInt();
        verticle=(n*m)/2-horizontal;
        if(n%2==0 && m%2==0) {
            if((verticle%m)%2==1) System.out.println("NO");
            else System.out.print("YES");
        }
        else if(n%2==0 && m%2==1) {
            if((verticle%m)%2==0) System.out.println("NO");
            else System.out.print("YES");
        }
        else {
            if((verticle%m)%2==1) System.out.println("NO");
            else System.out.print("YES");
        }
        
    }
}
