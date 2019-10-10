package Lecture10;

public class QUSDequeueEfficient {
	DynamicStack primary;
	DynamicStack secondary;

	public QUSDequeueEfficient() throws Exception {
		// TODO Auto-generated constructor stub
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();

	}

	public int size() {
		return this.primary.size();
	}

	public boolean isEmpty() {
		return this.primary.isEmpty();
	}

	// o(n) time
	public void enqueue(int data) throws Exception {
		while (primary.size() != 0) {
			secondary.push(primary.pop());
		}
		primary.push(data);
		while (secondary.size() != 0) {
			primary.push(secondary.pop());
		}

	}

	// o(1)
	public int dequeue() throws Exception {
		return this.primary.pop();
	}

	// o(1)
	public int front() throws Exception {
		return this.primary.top();
	}

	// o(n)
	public void display() {
		this.primary.display();
	}
}
