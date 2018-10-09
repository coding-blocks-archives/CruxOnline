package Lecture5;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class StringPerformance {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		appendStringSB(1000000);
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}

	public static void appendString(int n) {

		String s = "";

		for (int i = 1; i <= n; i++) {
			s = s + i;
		}
	}
	
	public static void appendStringSB(int n) {

		StringBuilder sb = new StringBuilder() ;

		for (int i = 1; i <= n; i++) {
			sb.append(i) ;
		}
	}
	

}
