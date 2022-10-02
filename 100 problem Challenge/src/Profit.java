//Question 7: 
//You are given an array of integers of size n where each element at index i denotes the value of Gold for the ith day. You need to find the maximum profit that can be made by a person by buying and selling Gold on different days.
//
//Input Format
//
//The first line contains an integer denoting n
//
//The second line contains n space separated integers denoting value for each day
//
//Constraints
//
//1<= n<= 100
//
//1<=A[i]<=10^9
//
//Output Format
//
//Print the maximum profit that can be made.
import java.util.*;
public class Profit {
    
    static int BuyGoldnSell(int arr[], int n) {
        int maxProfit=0;
        for(int j=1; j<n; j++) {
            if(arr[j]>arr[j-1]){
                maxProfit=maxProfit+arr[j]-arr[j-1];
            }
        }
        return maxProfit;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i= 0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(BuyGoldnSell(arr,n));
    }
}