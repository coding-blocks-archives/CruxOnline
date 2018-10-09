package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class Reverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;

		while (n != 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			n = n / 10;
		}

		System.out.println(ans);
	}

}
