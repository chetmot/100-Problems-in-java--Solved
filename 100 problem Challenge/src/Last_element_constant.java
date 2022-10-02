//question 80:
//Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. 
//Note: by default, a new int array contains all 0's.
import java.io.*;
import java.util.*;

public class Last_element_constant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x=0;
        for(int i=0; i<n; i++) {
            x = sc.nextInt();
        }
        n=n*2-1;
        while(n>0){
            System.out.print("0 ");
            n=n-1;
        }
        System.out.print(x);
    }
}
