//question 79:
//Given an integer array length n, return an array with the elements after k right rotations.
import java.io.*;
import java.util.*;

public class Right_rotation {
    
    static void rot_right(int arr[], int n) {
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]= temp;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        while(k>0){
            k=k-1;
            rot_right(arr, n);
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
