//question 89:
//A bracket is considered to be any one of the following characters: (, ), {, }, [, or ]. We say a sequence of brackets is considered to be balanced if the following conditions are met:
//
//It contains no unmatched brackets.
//The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
//Given n strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print YES on a new line; otherwise, print NO on a new line
//
//Input Format
//
//The first line contains a single integer n, denoting the number of strings.
//
//Each line i of the n subsequent lines consists of a single string, s , denoting a sequence of brackets
//
//Constraints
//
//1<=n<=30
//0<=length(s)<=30,length(s) is length of sequence
//Each character in the sequence will be a bracket (i.e., {, }, (, ), [, and ]).
//Create separate stack class and use one object to call its functions.
//
//Output Format
//
//For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.
import java.util.*;
public class Balanced_parens_stack {
	
	static boolean balancedOrNot(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c =='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
                if(stack.size()==0) return false;
				if(c==')' && stack.peek()=='(') stack.pop();
				else if(c=='}' && stack.peek()=='{') stack.pop();
				else if(c==']' && stack.peek()=='[') stack.pop();
				else return false;
			}
		}
		if(stack.size()!=0) return false;
		else return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String str = sc.nextLine();
			if(balancedOrNot(str)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

