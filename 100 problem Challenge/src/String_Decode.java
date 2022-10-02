//Question 22: 
//Given an encoded string, return its decoded string.
//
//The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. k is guaranteed to be a positive integer. The encoded_string inside a bracket can also be encoded for example 3[a2[c]] is decoded as "accaccacc"
//
//You may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 2[4].
//
//Input Format
//
//The first line contains a string in encoded form
//
//Constraints
//
//1 <= s.length <= 30
//
//s consists of lowercase English letters, digits, and square brackets '[]'
//
//Output Format
//
//Print the decoded string
import java.util.*;


public class String_Decode {
    static String decodeString(String s) {
        Stack<Integer> nums = new Stack<Integer>();
        Stack<Character> chars = new Stack<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                count = count * 10 + (c - '0');
            }
            else if (c == ']') {
                int repeat = nums.pop();
                String tmp = "";
                while (chars.peek() != '[') {
                   tmp = chars.pop() + tmp;     
                }
                chars.pop();
                for (int j = 0; j < repeat; j ++) {
                    for (int k = 0; k < tmp.length(); k ++) {
                        chars.push(tmp.charAt(k));
                    }
                }
            }
            else {
                if (count != 0) {
                    nums.push(count);
                }   
                count = 0;
                chars.push(c);
            }
        }
        String result = "";
        while (!chars.isEmpty()) {
            result = chars.pop() + result;
        }
        return result;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(decodeString(str));
    }
}