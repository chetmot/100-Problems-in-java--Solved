//question 75:
//Start with 2 int arrays, a and b, of any length and given a key as input. Return number of times the key appeared in these two arrays.
import java.io.*;
import java.util.*;

public class Findn {
    
    static int count(int arr[], int n, int k) {
        int count=0;
        for(int i=0; i<n; i++) {
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, k;
        a= sc.nextInt();
        b= sc.nextInt();
        k= sc.nextInt();
        int []one = new int[a];
        int []two = new int[b];
        for(int i=0; i<a; i++) {
            one[i]=sc.nextInt();
        }
        for(int i=0; i<b; i++) {
            two[i]=sc.nextInt();
        }
        System.out.println(count(one,a,k)+count(two,b,k));
    }
}
