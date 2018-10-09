package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class Pattern3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;

		// rows
		int row = 1;
		while (row <= n) {

			// work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep
			System.out.println();
			nst = nst - 1;
			row = row + 1;

		}

	}

}
