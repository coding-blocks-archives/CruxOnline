package Lecture11;

public class LL_AS_Stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LL_AS_Stack stack = new LL_AS_Stack();
     
		stack.push(10);
		stack.display();

		stack.push(20);
		stack.display();

		stack.push(30);
		stack.display();

		stack.push(40);
		stack.display();

		stack.push(50);
		stack.display();

		System.out.println(stack.pop());
		stack.display();
		
		System.out.println(stack.pop());
		stack.display();
		
		System.out.println(stack.top());
		
		System.out.println(stack.size());

	}

}
