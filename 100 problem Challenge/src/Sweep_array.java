//question 53:
//You are given an array A of N elements. You can do the following operations on that array:
//
//Remove the leftmost element of the array, with index l, for the cost Al. This can be done any number of times if the array is non-empty (has at least 1 element).
//Remove the rightmost element of the array, with index r, for the cost Ar. This can be done any number of times if the array is non-empty (has at least 1 element).
//Remove both the leftmost and rightmost element, with indexes l and r respectively, for a fixed cost X which is given. This operation can only be done K times and only if the array has at least 2 elements left.
//If the array has only 1 element left, then the rightmost element is the same as the leftmost element so the first and second operations will have the same cost.
//
//You have to print the minimum cost to clear the array (remove all elements using one of the three operations above).
//
//Input Format
//
//The first line contains three integers: N, K, and X separated by spaces.
//
//The second line contains N space-separated positive integers, A1,A2,…AN.
//
//Constraints
//
//1≤N≤500
//
//0≤K≤⌊N/2⌋
//
//1≤X≤10^4
//
//1≤Ai≤10^4
//
//Output Format
//
//Output on one line the minimum cost to clear the array.
import java.io.*;
import java.util.*;

public class Sweep_array {
    
    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l, Collections.reverseOrder());
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, x;
        n = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();
        int[] arr = new int[n];
        int[] removed = new int[n];
        long ans=0;
        for(int i=0; i<n; i++) {
            arr[i] =sc.nextInt();
            ans+=arr[i];
        }
        sort(arr);
        for(int i = 0; i<2*k; i+=2) {
            if(arr[i] + arr[i+1] > x){
                ans = (ans-(arr[i]+arr[i+1]))+x;
            }
        }
        System.out.println(ans);
    }
}
