package ba.bitcamp.samostalniRad.zadacaBenjo2;

public class MyQueue extends IDnumber {
	private Node head;
	private Node tail;
	private int idxMaker = 0;
	private IDnumber ordinal = new IDnumber();

	public MyQueue() {
		this.head = null;

	}

	public void push(String value) {

		if (head == null) {
			head = new Node(value, idxMaker);
			tail = head;
			idxMaker++;
		}

		Node newNode = new Node(value, idxMaker);
		tail.next = newNode;
		tail = newNode;
		idxMaker++;

	}

	public int getIndex() {
		return tail.index;
	}

	public String dequeue() {
		if (head == null) {
			throw new NullPointerException("Empty queue");

		} else if (head == tail) {

			String value = head.value;
			head = tail = null;
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

	public boolean isEmpty() {
		return (head == null);
	}

	private static class Node {

		public String value;
		public Node next;
		int index = 0;

		public Node(String value, int idx) {

			this.value = value;
			this.next = null;
			this.index = idx;
		}

	}

}
