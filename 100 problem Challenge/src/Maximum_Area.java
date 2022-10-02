//Question 10:
//You are given N points on a 2D plane having a x-coordinate and y-coordinate of the type (x,y).
//You need to find 4 points from the given N points such that these four points make a square. 
//Also the sides should be parallel to x-axis and y-axis. 
//If there are multiple such points, the selected square should be the one with greater length. 
//If there are still multiple choices of such points, choose those points in which the bottom left point has a lower y coordinate

//Input Format
//
//The first line contains a single integer N, denoting the number of points on the plane.
//
//Each of the next lines contain two space separated integers x and y, these denote the x and y coordinates of the point.
//
//Constraints
//
//1 <= n <= 1000
//
//1 <= x,y <= 109
//
//Output Format
//
//Print two space separated integers, the coordinates of the bottom left point of the square found. If there are no squares present, print -1.
import java.io.*;
import java.util.*;

public class Maximum_Area {
    
    static void Square(int x[], int y[], int n) {
        int check=0;
        for(int bl=0; bl<n; bl++) {
            for(int tl=0; tl<n; tl++){
                for(int tr=0; tr<n; tr++) {
                    for(int br=0; br<n; br++) {
                        if(x[bl]==x[tl] && y[bl]==y[br] && x[br]==x[tr] && y[tl]==y[tr] && x[bl]!=x[tr]
                          && y[bl]!=y[tr]){
                            System.out.println(x[bl]+" "+y[bl]);
                            check=1;
                            break;
                        }
                        else continue;
                    }
                    if(check==1) break;
                }
                if(check==1) break;
            }
            if(check==1) break;
        }
        if(check==0) System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        Square(x, y, n);
    }
}
