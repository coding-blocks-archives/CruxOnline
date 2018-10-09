package Lecture10.ClassObject;

public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("I am the default constrcutor");
	}

	//
	public Person(int age) {
		System.out.println("I am parameterized constructor with one parameter");
		this.age = age;
	}

	public Person(int age, String name) {
		System.out.println("I am parameterized constructor with two parameters");
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
