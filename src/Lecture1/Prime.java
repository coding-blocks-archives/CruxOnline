package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class Prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int divisor = 2;
		boolean flag = true ;
		
		while (divisor <= n - 1) {

			if(n % divisor == 0) {
				flag = false ;
			}
			
			divisor = divisor + 1;
		}
		
		if(flag == true) {
			System.out.println("Prime");
		}else {
			System.out.println("Non Prime");
		}

	}

}
