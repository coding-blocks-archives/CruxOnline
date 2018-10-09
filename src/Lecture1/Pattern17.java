package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class Pattern17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n / 2;
		int nsp = 1;

		// row
		int row = 1;
		while (row <= n) {

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// spaces work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// star work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// prep
			System.out.println();
			if (row <= n / 2) {
				nsp = nsp + 2;
				nst = nst - 1;
			} else {
				nsp = nsp - 2;
				nst = nst + 1;
			}
			row = row + 1;
		}

	}

}
