//Question 4:
//Given an array of integers A of size n, you need to find the largest number that can be formed by concatenating all the integers in a particular order
//
//Input Format
//
//The first line contains an integer n
//
//The next line contains n integers separated by space denoting the array elements
//
//Constraints
//
//-10^9 <= A[i] <= 10^9
//
//Output Format
//
//Print the largest number formed by concatenating all the integers in the array
import java.util.*;
public class Largest_Combination {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []nums = new String[n];
        int i;
        for(i=0; i<n; i++) {
            nums[i]=sc.next();
        }
        String max="";
        String temp;
        for(i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(Character.getNumericValue(nums[i].charAt(0))<Character.getNumericValue(nums[j].charAt(0))) {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(i=0;i<n; i++) {
            max=max+nums[i];
        }
        System.out.print(max);
    }
}
