package Lecture10;

public class SUQPopEfficient {
	private DynamicQueue primary;
	private DynamicQueue secondary;

	public SUQPopEfficient() throws Exception {
		this.primary = new DynamicQueue();
		this.secondary = new DynamicQueue();
	}

	public int size() {
		return this.primary.size();
	}

	public boolean isEmpty() {
		return this.primary.isEmpty();
	}

	// o(n)
	public void push(int data) throws Exception {
		while (this.primary.size() != 0) {
			this.secondary.enqueue(this.primary.dequeue());
		}

		this.primary.enqueue(data);
		while (this.secondary.size() != 0) {
			this.primary.enqueue(this.secondary.dequeue());
		}
	}

	// o(1) time
	public int pop() throws Exception {
		return this.primary.dequeue();
	}

    //o(1)time
	public int top() throws Exception {
		return this.primary.front();
	}
    //o(n) time
	public void display() {
      this.primary.display();
	}
}
