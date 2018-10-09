package Lecture3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class ArrayDemo {

	public static void main(String[] args) {

		// declare
		int[] arr = null;
		System.out.println(arr);

		// allocate space
		arr = new int[5];
		System.out.println(arr);

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// print
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// enhanced for loop
		for (int val : arr) {
			System.out.println(val);
		}

		int i = 0, j = 2;

		// non working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

		// working swap
		System.out.println(arr[i] + ", " + arr[j]);
		// Swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		int[] other = { 100, 200, 300 };
		System.out.println(arr[0] + ", " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);
	}

	public static void Swap(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
	}

	public static void Swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + ", " + arr[j]);

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		System.out.println(arr[i] + ", " + arr[j]);
	}

	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}
}
