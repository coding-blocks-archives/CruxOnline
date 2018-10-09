package Lecture1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in) ;
		int n = scn.nextInt() ;
		
		if(n % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		

	}

}
