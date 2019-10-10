package Lecture10;

public class QUSEnqueueEfficient {
	private DynamicStack primary;
	private DynamicStack secondary;

	public QUSEnqueueEfficient() throws Exception {
		// TODO Auto-generated constructor stub
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}

	public boolean isEmpty() {
		return this.primary.isEmpty();
	}

	public int size() {
		return this.primary.size();
	}

	// o(1) time
	public void enqueue(int data) throws Exception {
		this.primary.push(data);
	}

	// o(n) time
	public int dequeue() throws Exception {
		while (primary.size() != 1) {
			secondary.push(primary.pop());
		}
		int rv = primary.pop();
		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}

		return rv;
	}

	public int front() throws Exception {
		while (primary.size() != 1) {
			secondary.push(primary.pop());
		}
		int rv = primary.top();
		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}

		return rv;
	}
    //o(n) time
	public void display() throws Exception {
		reverseStack(primary, secondary, 0);
		primary.display();
		reverseStack(primary, secondary, 0);

	}

	public static void reverseStack(DynamicStack stack, DynamicStack helper, int index) throws Exception {
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
