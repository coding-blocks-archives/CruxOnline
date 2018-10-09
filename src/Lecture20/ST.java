package Lecture20;

public class ST {

	private class Node {
		int data;
		int startIndex;
		int endIndex;
		Node left;
		Node right;
	}

	Node root;

	ST(int[] arr) {
		this.root = this.construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			Node rv = new Node();
			rv.data = arr[startIndex];
			rv.left = null;
			rv.right = null;
			rv.startIndex = startIndex;
			rv.endIndex = endIndex;
			return rv;
		}
		int mid = (startIndex + endIndex) / 2;
		Node node = new Node();
		node.startIndex = startIndex;
		node.endIndex = endIndex;
		node.left = this.construct(arr, startIndex, mid);
		node.right = this.construct(arr, mid + 1, endIndex);
		node.data = node.left.data + node.right.data;
		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + "[" + node.left.startIndex + "-" + node.left.endIndex + "]" + " and data is " + node.left.data
					+ "=>";
		} else {
			str = str + "END=>";
		}
		str = str + "[" + node.startIndex + "-" + node.endIndex + "]" + " and data is " + node.data;
		if (node.right != null) {
			str = str + "<= and data is " + node.right.data + "[" + node.right.startIndex + "-" + node.right.endIndex
					+ "]";
		} else {
			str = str + "<=END";
		}

		System.out.println(str);
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int query(int qsi, int qei) {
		return this.query(this.root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {
		if (node == null) {
			return 0;
		}
		if (node.startIndex >= qsi && node.endIndex <= qei) {
			return node.data;
		} else if (node.endIndex < qsi || node.startIndex > qei) {
			return 0;// Default value of query
		} else {
			int left = this.query(node.left, qsi, qei);
			int right = this.query(node.right, qsi, qei);
			return left + right;
		}
	}

	public void update(int index, int value) {
		this.root.data = this.update(this.root, index, value);
	}

	private int update(Node node, int index, int value) {
		if (index >= node.startIndex && index <= node.endIndex) {
			if (index == node.startIndex && index == node.endIndex) {
				node.data = value;
			} else {
				int leftvalue = this.update(node.left, index, value);
				int rightvalue = this.update(node.right, index, value);
				node.data = leftvalue + rightvalue;
			}
		}
		return node.data;
	}

}
