package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class Pattern0While {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		while (row <= n) {
			// work
			System.out.print("*");

			// prep
			System.out.println();
			row = row + 1;

		}

	}

}
