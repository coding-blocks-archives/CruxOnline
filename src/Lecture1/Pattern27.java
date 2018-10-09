package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class Pattern27 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int nsp = n - 1;
		int val;

		// row
		int row = 1;
		while (row <= n) {

			val = 1;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");

				if (cst <= nst / 2)
					val++;
				else
					val--;
			}

			// prep
			System.out.println();
			nsp--;
			nst += 2;
			row++;

		}

	}

}
