package Lecture6;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PD(5);
		// PI(5);
		// PDI(5);
		// PDISkip(5);
		// System.out.println(Fact(6));

		// System.out.println(power(2, 5));
		// System.out.println(fib(5));

		// int[] arr = { 3, 6, 7, 8, 9 };
		// System.out.println(isSorted(arr, 0));

		// int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		// System.out.println(firstIndex(arr, 0, 7));

		// int[] arr = { 3, 8, 1, 8, 8, 7 };
		// System.out.println(lastIndex(arr, 0, 8));

		// pattern(5, 1, 1);
		// int[] arr = { 50, 40, 30, 20, 10 };
		// bubbleSort(arr, 0, arr.length - 1);
		// display(arr);

		int[] arr = { 3, 8, 1, 8, 8, 4 };
		int[] ans = allIndices(arr, 0, 1, 0);
		display(ans);

	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PDISkip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);
		}
		PDISkip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

	public static int Fact(int n) {
		if (n == 1) {
			return 1;
		}
		int fnm1 = Fact(n - 1);
		int fn = n * fnm1;
		return fn;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pnm1 = power(x, n - 1);
		int pn = x * pnm1;
		return pn;
	}

	public static int fib(int n) {
		if (n == 1) {
			return n;
		}
		if (n == 0) {
			return n;
		}
		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			boolean restAns = isSorted(arr, si + 1);
			return restAns;
		}
	}

	public static int firstIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		} else {
			int restAns = firstIndex(arr, si + 1, data);
			return restAns;
		}
	}

	public static int lastIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		int index = lastIndex(arr, si + 1, data);
		if (index == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return index;
		}
	}

	public static void pattern(int N, int row, int col) {
		if (row > N) {
			return;
		}

		if (col > row) {
			System.out.println();
			pattern(N, row + 1, 1);
			return;
		}

		System.out.print("*\t");
		pattern(N, row, col + 1);
	}

	public static void bubbleSort(int[] arr, int si, int li) {
		if (li == 0) {
			return;
		}
		if (si == li) {
			bubbleSort(arr, 0, li - 1);
			return;
		}
		if (arr[si] > arr[si + 1]) {
			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
		}
		bubbleSort(arr, si + 1, li);
	}

	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			int[] base = new int[count];
			return base;
		}
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);

		}
		if (arr[si] == data) {
			indices[count] = si;
		}
		return indices;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
