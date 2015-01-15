package ba.bitcamp.samostalniRad;

/*
 * week 10, day 02
 * Priority Queue 
 * List of integer elements that are sorted in queue by priority
 * @author jesenkogavric
 */

public class PriorityQueue {

	private Node head;
	private Node tail;

	private class Node {

		private int value;
		Node next;
		int priority;

		/* Node constructor */
		public Node(int value, int priority) {
			this.value = value;
			this.priority = priority;
		}
	}// end of class Node

	/**
	 * Method adds a element to queue and sets it into place according to
	 * priority. Bigger priority gets a higher place in queue and is going to be
	 * popped sooner.
	 * @param Value of the element
	 * @param Priority in the list
	 */
	public void push(int value, int priority) {

		Node newNode = new Node(value, priority);
		if (head == null) {
			head = newNode;
			tail = head;
			return;
		}
		if (newNode.priority > head.priority) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node current = head.next;
		Node previous = head;
		while (current != null) {
			if (newNode.priority > current.priority) {
				newNode.next = current;
				previous.next = newNode;
				return;
			}
			current = current.next;
			previous = previous.next;
		}
		tail.next = newNode;
		tail = tail.next;
	}

	/* Prvobitni kod, nepotreban 'if' */
	// if (newNode.priority <= tail.priority) {
	// tail.next = newNode;
	// tail = newNode;
	// return;
	// }
	// Node current = head;
	// while (current.next != null) {
	// if (newNode.priority > current.next.priority
	// && newNode.priority < current.priority ||
	// newNode.priority == current.priority) {
	//
	// newNode.next = current.next;
	// current.next = newNode;
	//
	// return;
	// }
	// current = current.next;
	// }
	//
	// }

	/**
	 * Method 'pops' the first element of the list, that is, the element with
	 * the highest priority which is sorted in the 'push' method, and returns
	 * its value.
	 * @return Value of the popped element
	 */
	public int pop() {

		if (head == null) {
			throw new IllegalStateException("Empty queue");
		}
		if (head == tail) {
			tail = null;
		}

		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;
	}

	/**
	 * @return the value of the first element in the queue. 
	 * ( Element with the highest priority )
	 */
	public int peek() {
		return head.value;
	}

	/**
	 * @return the size of the queue (number of elements)
	 */
	public int getSize() {
		if (head == null) {
			return 0;
		}
		return getSize(head, 0);
	}

	/* recursive method for get size */
	public int getSize(Node current, int counter) {
		if (current == null) {
			return counter;
		}
		return getSize(current.next, counter + 1);
	}

	/**
	 * Method checks if there is a certain value in the queue
	 * @param The value we search for
	 * @return true or false
	 */
	public boolean contains(int value) {
		if (head.value == value) {
			return true;
		}
		return contains(head, value);
	}

	/* recursive method for 'contains' */
	public boolean contains(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (current.value == value) {
			return true;
		}
		return contains(current.next, value);
	}

	/**
	 * Checks if the queue is empty
	 * @return true or false
	 */
	public boolean isEmpty() {
		return (head == null);
	}

}// end of class PriorityQueue
