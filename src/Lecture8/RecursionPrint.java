package Lecture8;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class RecursionPrint {

	public static void main(String[] args) {

		// printSS("abc", "");
		// printPermutation("abc", "");
		// printBoardPath(0, 10, "");
		// int c = countBoardPath(0, 10);
		// System.out.println(c);
		// printMazePath(0, 0, 2, 2, "");
		// System.out.println(countMazePath(0, 0, 2, 2));

		// printMazePathD(0, 0, 2, 2, "");
		// System.out.println(countMazePathD(0, 0, 2, 2));

		boolean[][] board = new boolean[4][4];
		// System.out.println(countNQueens(board, 0));
		printNQueens(board, 0, "");
	}

	public static void printSS(String str, String result) {

		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSS(ros, result);
		printSS(ros, result + cc);
	}

	public static void printPermutation(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			printPermutation(roq, ans + ch);
		}
	}

	public static void printBoardPath(int curr, int end, String ans) {

		if (curr == end) {
			System.out.println(ans);
			return;
		}

		if (curr > end) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			printBoardPath(curr + dice, end, ans + dice);
		}
	}

	public static int countBoardPath(int curr, int end) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardPath(curr + dice, end);
		}

		return count;
	}

	public static void printMazePath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		printMazePath(cr, cc + 1, er, ec, ans + "H");
		printMazePath(cr + 1, cc, er, ec, ans + "V");

	}

	public static int countMazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int ch = countMazePath(cr, cc + 1, er, ec);
		int cv = countMazePath(cr + 1, cc, er, ec);

		return ch + cv;
	}

	public static void printMazePathD(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		printMazePathD(cr, cc + 1, er, ec, ans + "H");
		printMazePathD(cr + 1, cc, er, ec, ans + "V");
		printMazePathD(cr + 1, cc + 1, er, ec, ans + "D");

	}

	public static int countMazePathD(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int ch = countMazePathD(cr, cc + 1, er, ec);
		int cv = countMazePathD(cr + 1, cc, er, ec);
		int cd = countMazePathD(cr + 1, cc + 1, er, ec);

		return ch + cv + cd;
	}

	public static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}

		int count = 0;

		for (int col = 0; col < board[row].length; col++) {

			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;
			}
		}

		return count;
	}

	public static void printNQueens(boolean[][] board, int row, String result) {
		if (row == board.length) {
			System.out.println(result);
			return;
		}

		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1, result + "{" + (row + 1) + "-" + (col + 1) + "};");
				board[row][col] = false;
			}
		}

	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}

		return true;

	}
}