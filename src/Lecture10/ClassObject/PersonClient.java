package Lecture10.ClassObject;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(25);

		Person p4 = new Person(20, "D");

		// System.out.println(p1.name);
		// System.out.println(p1.age);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		// p2.name = "A";
		// p2.age = 10;
		// p2.setName("A");
		// p2.setAge(10);

		System.out.println(p2.getName());
		System.out.println(p2.getAge());

		System.out.println(p3.getAge());
		System.out.println(p3.getName());

		System.out.println(p4.getAge());
		System.out.println(p4.getName());
	}

}
