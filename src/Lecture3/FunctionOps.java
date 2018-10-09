package Lecture3;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class FunctionOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt();
		int db = scn.nextInt();
		// int sb = scn.nextInt();
		//
		// int res = anybaseToDecimal(snum, sb);
		// System.out.println(res);

		int res = decimalToAnybase(snum, db);
		System.out.println(res);
	}

	public static int anybaseToDecimal(int snum, int sb) {

		int ans = 0;

		int multiplier = 1;

		while (snum != 0) {

			int rem = snum % 10;
			ans = ans + (rem * multiplier);

			multiplier = multiplier * sb;
			snum = snum / 10;

		}

		return ans;

	}

	public static int decimalToAnybase(int snum, int db) {

		int ans = 0;

		int multiplier = 1;

		while (snum != 0) {

			int rem = snum % db;
			ans = ans + (rem * multiplier);

			multiplier = multiplier * 10;
			snum = snum / db;

		}

		return ans;

	}

}
