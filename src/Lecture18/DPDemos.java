package Lecture18;

public class DPDemos {
	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		int[] strg = new int[n + 1];
		// startAlgo();
		// System.out.println(fib(n));
		// System.out.println("Fib Normal took time " + endAlgo() + " ms ");
		//
		// startAlgo();
		// System.out.println(fibRS(n, strg));
		// System.out.println("Fib Recursive Storage took time " + endAlgo() + "
		// ms ");
		//
		// startAlgo();
		// System.out.println(fibIS(n));
		// System.out.println("Fib Iterative storage took time " + endAlgo() + "
		// ms ");

		// startAlgo();
		// System.out.println(cbp(n, 0));
		// System.out.println("CBP Normal took time " + endAlgo() + " ms ");
		//
		// startAlgo();
		// System.out.println(cbpRS(n, 0, strg));
		// System.out.println("CBP Recursive Storage took time " + endAlgo() + "
		// ms ");
		//
		// startAlgo();
		// System.out.println(cbpIS(n, 0));
		// System.out.println("CBP Iterative Storage took time " + endAlgo() + "
		// ms ");
		// String str1 = "abbgjdjdsjvjsisjskjscscs", str2 =
		// "agbgcncjscskcjssjss";
		// startAlgo();
		// System.out.println(lcs(str1, str2));
		// System.out.println("lcs Normal took time " + endAlgo() + " ms ");
		//
		// startAlgo();
		// System.out.println(lcsI(str1, str2));
		// System.out.println("lcs Iterative took time " + endAlgo() + " ms ");
		String s1 = "agbgcjdnjdjcsdjcsjcjs", s2 = "acgbcjcnjcsjcs";
		startAlgo();
		System.out.println(editDistance(s1, s2));
		System.out.println("ed Normal took time " + endAlgo() + " ms ");

		startAlgo();
		System.out.println(editDistanceI(s1, s2));
		System.out.println("ed Iterative took time " + endAlgo() + " ms ");
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

	public static int fibRS(int n, int[] strg) {
		if (n == 1) {
			return n;
		}
		if (n == 0) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibRS(n - 1, strg);
		int fnm2 = fibRS(n - 2, strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

	public static int fibIS(int n) {
		int[] strg = new int[n + 1];

		// seed
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int cbp(int end, int curr) {
		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbp(end, curr + dice);
		}
		return count;
	}

	public static int cbpRS(int end, int curr, int[] strg) {
		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbpRS(end, curr + dice, strg);
		}
		strg[curr] = count;
		return count;
	}

	public static int cbpIS(int end, int curr) {
		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int count = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				count = count + strg[dice + i];
			}
			strg[i] = count;
		}

		return strg[curr];
	}

	public static int lcs(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);

		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(ros1, str2);
			int f2 = lcs(str1, ros2);
			count = Math.max(f1, f2);
		}
		return count;
	}

	public static int lcsI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		// seed
		strg[s1.length()][s2.length()] = 0;

		for (int i = s1.length(); i >= 0; i--) {
			for (int j = s2.length(); j >= 0; j--) {
				if (i == s1.length() || j == s2.length()) {
					strg[i][j] = 0;
					continue;
				}
				if (s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] = 1 + strg[i + 1][j + 1];
				} else {
					strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);
				}
			}
		}

		return strg[0][0];
	}

	public static int editDistance(String s1, String s2) {
		if (s1.length() == 0) {
			return s2.length();
		}

		if (s2.length() == 0) {
			return s1.length();
		}
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (s1.charAt(0) == s2.charAt(0)) {
			ans = editDistance(ros1, ros2);
		} else {
			int f1 = 1 + editDistance(ros1, ros2);
			int f2 = 1 + editDistance(ros1, s2);
			int f3 = 1 + editDistance(s1, ros2);
			ans = Math.min(f1, Math.min(f2, f3));
		}
		return ans;
	}

	public static int editDistanceI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 2];
		strg[s1.length()][s2.length()] = 0;
		for (int i = s1.length(); i >= 0; i--) {
			for (int j = s2.length(); j >= 0; j--) {
				if (i == s1.length()) {
					strg[i][j] = s2.length() - j;
					continue;
				}
				if (j == s2.length()) {
					strg[i][j] = s1.length() - i;
					continue;
				}

				if (s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] = strg[i + 1][j + 1];
				} else {
					strg[i][j] = 1 + Math.min(strg[i + 1][j + 1], Math.min(strg[i + 1][j], strg[i][j + 1]));
				}
			}
		}
		return strg[0][0];
	}

}
