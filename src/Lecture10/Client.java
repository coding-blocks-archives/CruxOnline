package Lecture10;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}
		stack.display();
		StackUsingArrays helper = new StackUsingArrays(5);
		reverseStack(stack, helper, 0);
		stack.display();
	}

	public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper, int index) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(item);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}

}
