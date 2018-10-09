package Lecture10.Inheritance;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 */

public class C extends P {

	int d = 20;
	int d2 = 200;

	@Override
	public void fun() {
		System.out.println("In C Fun");
	}

	public void fun2() {
		System.out.println("In C Fun2");
	}
}
