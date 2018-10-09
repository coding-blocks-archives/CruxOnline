package Lecture10.Overloading;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 */

public class FxnOverloadingDemo {

	public static void main(String[] args) {

		System.out.println(sum(2, 3));
		System.out.println(sum(2, 3, 4));
		System.out.println(sum(2.1, 3));
		System.out.println(sum(3.2, "hello"));
		// sum(2, 3);
		int[] arr = { 2, 3, 4, 5, 6 };
		System.out.println(sum("hello", arr));
	}

	public static int sum(int a, int b) {
		System.out.println("in sum of 2 args");
		return a + b;
	}

	// public static void sum(int a, int b) {
	// System.out.println(a + b);
	// }

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static double sum(double a, String b) {
		return a;
	}

	public static int sum(String str, int... args) {

		int sum = 0;

		for (int val : args) {
			sum += val;
		}
		return sum;
	}

}
