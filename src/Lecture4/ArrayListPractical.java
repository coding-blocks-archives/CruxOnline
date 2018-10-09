package Lecture4;

import java.util.ArrayList;

public class ArrayListPractical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list);
		System.out.println(list.size());

		list.add(10);
		System.out.println(list);
		System.out.println(list.size());

		list.add(20);
		System.out.println(list);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list);
		System.out.println(list.size());

		list.add(40);
		System.out.println(list);
		System.out.println(list.size());

		list.add(50);
		System.out.println(list);
		System.out.println(list.size());

		System.out.println("****************");

		System.out.println(list.get(4));
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());

	}

}
