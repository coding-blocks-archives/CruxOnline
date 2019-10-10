package Lecture11;

public class LL_AS_Stack {
	private LinkedList stack;

	public LL_AS_Stack() {
		this.stack = new LinkedList();
	}

	public int size() {
		return this.stack.size();
	}

	public boolean isEmpty() {
		return this.stack.isEmpty();
	}

	public void push(int data) {
		this.stack.addFirst(data);
	}

	public int pop() throws Exception {
		return this.stack.removeFirst();
	}

	public int top() throws Exception {
		return this.stack.getFirst();
	}

	public void display() {
		this.stack.display();
	}

}
