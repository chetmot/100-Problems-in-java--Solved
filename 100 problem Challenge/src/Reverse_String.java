//Question 17:
//Given a string s which can contain spaces, you need to reverse the string per word. That is for the given string "I study at IIT Tirupati" becomes "I yduts ta TII itapuriT"
//
//Input Format
//
//The first and only line contains the string s
//
//Constraints
//
//s = [a-z A-Z ]
//
//Output Format
//
//Print the reversed string

import java.util.*;

public class Reverse_String {
    
    static void ReverseString(String str) {
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1.reverse();
        System.out.print(input1+" ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] StrArray = null;
        StrArray = str.split(" ");
        for(int i=0; i<StrArray.length; i++){
            ReverseString(StrArray[i]);
        }
    }
}