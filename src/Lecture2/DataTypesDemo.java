package Lecture2;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part 1
		byte b = 10;
		short sh = 20;
		int in = 30;
		long ln = 40;

		// b=sh;
		// b=in;
		// b=ln;

		sh = b;
		// sh=in;
		// sh=ln;

		in = b;
		in = sh;
		// in=ln;

		ln = b;
		ln = sh;
		ln = in;

		// Part 2
		b = 10;
		b = 127;
		b = (byte) 128;
		System.out.println(b);

		// Part 3
		in = 1000000000;
		// in=10000000000;
		ln = 10000000000L;
		System.out.println(ln);

		// Part 4
		sh = 32000;

		// Part 5
		// float f=5.5;
		float f = 5.5f;
		System.out.println(f);

		double db = 6.5;

		// Part 6
		in = (int) f;
		System.out.println(in);

		f = in;
		System.out.println(f);

		// Part 7
		boolean bit = true;
		// bit=1;
		// bit=0;
		if (bit) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}

		bit = false;
		if (bit) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}

		if (in > 0) {
			System.out.println("Greater");
		} else {
			System.out.println("Lesser Or Equal");
		}

		// if(1){
		//
		// }

		// Part 8
		char ch = 'a';
		ch = 99;
		System.out.println(ch);

		// ch=64000;
		// System.out.println(ch);
		ch = (char) (ch + 2);
		System.out.println(ch);

		in = ch;
		System.out.println(in);

		// ch=68000;
		ch = (char) 68000;
		System.out.println(ch);

		// Part 9
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 5);
		System.out.println(2 + " " + 5);
		System.out.println("Hello" + '\t' + "World");
		System.out.println("Hello" + "\t" + "World");
	}

}
