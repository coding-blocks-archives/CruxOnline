package Lecture15;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String, Integer> map = new HashTable<>(4);
		map.put("USA", 200);
		map.put("UK", 175);
		map.put("India", 300);
		map.put("India", 325);

		// map.display();

		map.put("China", 350);
		// map.display();
		// map.display();

		// map.display();

		map.put("Sweden", 100);
		// map.display();

		map.put("Nepal", 50);
		map.display();
		map.put("Ireland", 75);
		map.display();

		// System.out.println("***********************Get**************************");
		// System.out.println(map.get("India"));
		// System.out.println(map.get("Sweden"));
		// System.out.println(map.get("RSA"));
		//
		// System.out.println("*******************Remove****************************");
		// System.out.println(map.remove("India"));
		// map.display();

	}

}
