//Question 33:
//Given two sorted integer arrays A1 and A2 of size n1 and n2 respectively, return an array which is a sorted array and contains all the elements of both the arrays.
//
//Input Format
//
//The first line contains two space separated integers denoting n1 and n2
//
//The second line contains n1 space separated integers denoting elements of array A1
//
//The third line contains n2 space separated integers denoting elements of array A2
//
//Constraints
//
//1 <= n1, n2<= 1000 0 <= A1[i], A2[i] <= 10^9
//
//Output Format
//
//Print the elements of the new array in single line separated by a pace
import java.io.*;
import java.util.*;

public class Merge_Arrays {

    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                int n2, int[] arr3)
    {
        int x = 0, y = 0, z = 0;
        while (x<n1 && y <n2)
        {

            if (arr1[x] < arr2[y])
                arr3[z++] = arr1[x++];
            else
                arr3[z++] = arr2[y++];
        }

        while (x < n1)
            arr3[z++] = arr1[x++];
        while (y < n2)
            arr3[z++] = arr2[y++];
    }
     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        int a3[] = new int[n1+n2];
        for(int i=0; i<n1; ++i){
            a1[i] = sc.nextInt();
        }
        for(int i=0; i<n2; ++i){
            a2[i] = sc.nextInt();
        }
        mergeArrays(a1, a2, n1, n2, a3);
        for(int q=0; q<n1+n2; ++q){
            System.out.print(a3[q]+" ");
        }
    }
}
