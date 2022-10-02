//question 99:
//Write a program to solve N-Queen Problem. The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other. 

import java.util.*;
public class N_queens_problem {
	
	public static boolean isSafe(int row, int col, char[][]board) {
		for(int j=0; j<board.length; j++) {
			if(board[row][j]=='1') {
				return false;
			}
		}
		for(int i=0; i<board.length; i++) {
			if(board[i][col]=='1') {
				return false;
			}
		}
		int r =row;
		for(int c=col; c>=0 && r>=0; c--,r--) {
			if(board[r][c]=='1') {
				return false;
			}
		}
		r=row;
		for(int c=col; c<board.length && r>=0; c++,r--) {
			if(board[r][c]=='1') {
				return false;
			}
		}
		r=row;
		for(int c=col; c>=0 && r<board.length; c--,r++) {
			if(board[r][c]=='1') {
				return false;
			}
		}
		for(int c= col; c>=0 && r<board.length; r++,c--) {
			if(board[r][c]=='1') {
				return false;
			}
		}
		return true;
	}
	
	public static void saveBoard(char[][] board, List<List<String>> allBoards) {
		String row = "";
		List<String> newboard = new ArrayList<>();
		
		for(int i=0; i<board.length; i++) {
			row = "";
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j] =='1') {
					row+='1';
				}
				else 
					row+="0";
			}
			newboard.add(row);
		}
		allBoards.add(newboard);
	}
	
	public static void Helper(char[][] board,List<List<String>> allBoards, int col) {
		if(col == board.length) {
			saveBoard(board,allBoards);
			return;
		}
		for(int row = 0; row<board.length; row++) {
			if(isSafe(row,col, board)) {
				board[row][col] = '1';
				Helper(board,allBoards,col+1);
				board[row][col] = '0';
			}
		}
	}
	
	public static List<List<String>> solveNqueens(int n) {
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
		
		Helper(board, allBoards, 0);
		return allBoards;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<String>> allBoards =solveNqueens(n);
		if(n<4) {
			System.out.println("Not exist");
			System.exit(0);
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print((allBoards.get(0)).get(i).charAt(j)+" ");
			}
			System.out.println();
		}
	}
}


