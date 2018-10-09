package Lecture5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class StringBuilderDemo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in) ;
		
		String str = scn.nextLine() ;
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());

		// append
		sb.append("abc");
		System.out.println(sb);

		// insert
		sb.insert(2, "def");
		System.out.println(sb);

		sb.insert(sb.length(), 'g');
		System.out.println(sb);

		// delete
		sb.deleteCharAt(3);
		System.out.println(sb);

		// update
		sb.setCharAt(4, 'd');
		System.out.println(sb);

		// ranges
		sb.insert(sb.length(), 'i');
		System.out.println(sb);

		String s = sb.toString() ;
		System.out.println(s);
	}

}
