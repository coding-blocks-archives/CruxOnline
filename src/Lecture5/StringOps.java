package Lecture5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class StringOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
//		printChars(str);
		printSS(str);
	}

	public static void printChars(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printSS(String str) {

		for (int si = 0; si <= str.length() - 1; si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String ss = str.substring(si, ei);
				System.out.println(ss);
			}
		}

	}
}
