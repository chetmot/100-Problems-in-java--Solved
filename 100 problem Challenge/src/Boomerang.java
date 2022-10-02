//Question 31:
//Given an array of three points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.
//
//A boomerang is a set of three points that are all distinct and not in a straight line.
//
//Input Format
//
//The first line contains two space separated integer x[0] y[0] denoting the first point
//
//The second line contains two space separated integer x[1] y[1] denoting the second point
//
//The third line contains two space separated integer x[2] y[2] denoting the third point
//
//Constraints
//
//0 <= xi, yi <= 100
//
//Output Format
//
//Print true if it is a boomerang or else false
import java.io.*;
import java.util.*;

public class Boomerang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[3];
        int y[] = new int[3];
        for(int i=0; i<3; ++i){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int area = x[0]*(y[1]-y[2])+x[1]*(y[2]-y[0])+x[2]*(y[0]-y[1]);
        if(area==0){
            System.out.print("false");
        }
        else{
            System.out.print("true");
        }
    }
}
