//question 78:
//Given an integer array length 5, return an array with the elements "rotated left" so {1, 2, 3, 4, 5} yields {2, 3, 4, 5, 1}.
import java.io.*;
import java.util.*;

public class Left_rotation {
    
    static void swap(int x, int y){
        int temp;
        temp=y;
        y=x;
        x=temp;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0; i<5; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[0]+" ");
    }
}