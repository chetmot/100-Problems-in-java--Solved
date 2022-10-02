////Question 14:
//Sam have an array A having N integer values. After using it for a while, he wants to update value of its element. In one second he can increase value of each array element by 1. He wants each array element's value to become greater than or equal to K. Please help Sam to find out the minimum amount of time it will take, for him to do so.
//
//Input Format
//
//First line consists of two space separated integers denoting N and K.
//
//Second line consists of N space separated integers denoting the array A.
//
//Constraints
//
//1 <= N, K <= 10^6
//
//Output Format
//
//Print the minimum time in which all array elements will become greater than or equal to K.
import java.io.*;
import java.util.*;

public class Update_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int x, min=1000000;
        for(int i=0; i<n; i++){
            x= sc.nextInt();
            if(x<=min){
                min=x;
            }
        }
        System.out.println((k-min));
    }
}
