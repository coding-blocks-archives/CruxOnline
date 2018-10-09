package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class Pattern21 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int nsp = 2 * n - 3;

		// rows
		int row = 1;
		while (row <= n) {

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			int cst = 1;
			if (row == n) {
				cst = 2;
			}
			// stars
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}

			// prep
			System.out.println();
			nst = nst + 1;
			nsp = nsp - 2;
			row = row + 1;

		}

	}

}
