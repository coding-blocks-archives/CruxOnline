package Lecture1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class SimpleInterest {

	public static void main(String[] args) {
		
		int principal = 1000 ;
		int rate = 5 ;
		int time = 2 ;
		
		int si = (principal * rate * time) / 100 ;
		
		System.out.println("Simple Interest is " + si);

	}

}
