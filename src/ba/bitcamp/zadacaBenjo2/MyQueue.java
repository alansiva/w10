package ba.bitcamp.zadacaBenjo2;

public class MyQueue {
	private Node head;
	private Node tail;
	private int mainCount = 1;

	public MyQueue() {
		this.head = null;
		this.tail = null;
	}

	public void push(String value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = tail = newNode;
			newNode.index = mainCount;
			mainCount++;
		} else {
			tail.next = newNode;
			tail = newNode;
			newNode.index = mainCount;
			mainCount++;
		}
	}

	public int getIndexX() {
		return head.getIndex();
	}

	public String pop() {
		if (head == null) {
			throw new NullPointerException("Empty queue");
		} else if (head == tail) {
			Node current = head;
			String value = current.value;
			head = tail = null;
			current = null;
			return value;
		} else {
			Node current = head;
			head = head.next;
			String value = current.value;
			current = null;
			return value;
		}
	}

	public String peek() {
		if (head == null) {
			throw new NullPointerException("Empty queue");
		}
		return head.value;
	}

	public int size() {
		if (head == null) {
			return 0;
		} else {
			return getSize(head, 0);
		}
	}

	private int getSize(Node current, int counter) {
		if (current == null) {
			return counter;
		} else {
			return getSize(current.next, counter + 1);
		}

	}

	public boolean contains(String value) {
		if (head.value.equals(value)) {
			return true;
		} else {
			return contains(head, value);
		}
	}

	private boolean contains(Node current, String value) {

		if (current == null) {
			return false;
		}
		if (current.value.equals(value)) {
			return true;
		} else {
			return contains(current.next, value);
		}
	}

	public boolean isEmpty() {
		return (head == null);
	}

	private static class Node {
		public String value;
		public Node next;
		public int index;

		public Node(String value) {
			this.value = value;
			this.next = null;
			this.index = 0;
		}

		public int getIndex() {
			return index;
		}
	}

}
