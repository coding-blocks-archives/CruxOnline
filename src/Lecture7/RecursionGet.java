package Lecture7;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @course Online Java DSA
 */

public class RecursionGet {

	public static void main(String[] args) {

		// System.out.println(getSS("abc"));
		// System.out.println(getPermutations("abc"));
		// System.out.println(getBoardPath(0, 10));
		System.out.println(getMazePathD(0, 0, 2, 2));
	}

	public static ArrayList<String> getSS(String str) {
		
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();

		ArrayList<String> recResult = getSS(ros);

		for (int i = 0; i < recResult.size(); i++) {
			
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}

		return myResult;
	}

	public static ArrayList<String> getPermutations(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getPermutations(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {

			for (int i = 0; i <= rrs.length(); i++) {

				String val = rrs.substring(0, i) + ch + rrs.substring(i);
				mr.add(val);
			}
		}

		return mr;
	}

	public static ArrayList<String> getBoardPath(int curr, int end) {

		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getBoardPath(curr + dice, end);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}

		}

		return mr;

	}

	public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazePath(cr, cc + 1, er, ec);

		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrv = getMazePath(cr + 1, cc, er, ec);

		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		return mr;

	}

	public static ArrayList<String> getMazePathD(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazePathD(cr, cc + 1, er, ec);

		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrv = getMazePathD(cr + 1, cc, er, ec);

		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		ArrayList<String> rrd = getMazePathD(cr + 1, cc + 1, er, ec);

		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}

		return mr;

	}

}
