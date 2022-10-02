//question 82:
import java.io.*;
import java.util.*;

public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k, i, temp;
        int[] arr= new int[n];
        for(i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        k=n-1;
        while(k>0) {
            for(i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]) {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            k=k-1;
        }
        for(i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}