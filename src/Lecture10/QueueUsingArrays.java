package Lecture10;

public class QueueUsingArrays {
	protected int[] data;
	protected int size;
	protected int front;

	public static final int DEFAULT_CAPACITY = 10;

	public QueueUsingArrays() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public QueueUsingArrays(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid Capacity");
		}

		this.data = new int[capacity];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void enqueue(int value) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Queue is Full");
		}
		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = value;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;
	}

	public int front() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[this.front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + "=>");
		}
		System.out.println("END");
	}
}
