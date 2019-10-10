package Lecture11;

public class LL_AS_Queue {
	private LinkedList queue;

	public LL_AS_Queue() {
		this.queue = new LinkedList();
	}

	public int size() {
		return this.queue.size();
	}

	public boolean isEmpty() {
		return this.queue.isEmpty();
	}

	public void enqueue(int data) {
		this.queue.addLast(data);
	}

	public int dequeue() throws Exception {
		return this.queue.removeFirst();
	}

	public int front() throws Exception {
		return this.queue.getFirst();
	}

	public void display() {
		this.queue.display();
	}
}
