package ba.bitcamp.zadacaBenjo;

/**
 * Class implements a linked list of integers
 * 
 * @author jesenkogavric
 *
 */

public class LinkedList {

	private Node head;
	private int size;

	/* Constructors for the linked list */
	public LinkedList() {
		head = null;
		size = 0;
	}

	private class Node {

		public int value;
		public Node next;

		/* constructors for Node */
		public Node(int value) {
			this.value = value;
			next = null;

		}

	}

	/**
	 * Method adds another linked list to a current list
	 * 
	 * @param other
	 *            linked list
	 */
	public void add(LinkedList other) {
		this.size = other.size;
		Node current = head;
		if (head == null) {
			this.head = other.head;
			return;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = other.head;

	}

	/**
	 * Method adds a new element into list
	 * 
	 * @param value
	 *            to add
	 */
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;

	}

	/**
	 * Method adds a new element in a specified place in the list
	 * 
	 * @param value
	 *            to add
	 * @param offset
	 *            where to add
	 */
	public void add(int value, int index) {
		if (index < 0 || index >= size) {
			throwIOBexception(index);
		}
		Node newNode = new Node(value);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		if (index == size) {
			add(value);
			return;
		}
		Node current = head;
		int count = 1;
		while (count < index) {
			current = current.next;
			count++;
		}
		newNode.next = current.next;
		current.next = newNode;
		size++;

	}

	/**
	 * Method removes an element from a specified index of the list
	 * 
	 * @param offset
	 *            from where to remove
	 */
	public void removeAt(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index out of list");

		if (index == 0) {
			head = head.next;
			size--;
			return;
		}

		Node current = head.next;
		Node previous = head;
		int count = 1;
		while (count < index) {
			current = current.next;
			previous = previous.next;
			count++;
		}
		previous.next = current.next;
		current.next = null;
		size--;
	}

	/**
	 * Method removes the last element from the list
	 * 
	 * @return the value of the removed element
	 */
	public int remove() {
		if (head == null) {
			throw new IllegalStateException("Empty list");
		}
		Node current = head.next;
		Node previous = head;
		int value = 0;

		while (previous.next != null) {
			if (current.next == null) {
				value = current.value;
				previous.next = null;
				size--;
				break;
			}
			current = current.next;
			previous = previous.next;
		}
		return value;
	}

	/**
	 * @return the size of the list
	 */
	public int size() {
		return size;
	}

	/**
	 * @return the value of the middle element of the list
	 */
	public int getMiddleValue() {
		Node fast = head;
		Node slow = head;
		while (fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.value;
	}

	/**
	 * Method returns the value from a certain offset from the end of the list
	 * 
	 * @param offset
	 *            counted from the end of the list
	 * @return the value from the given offset
	 */
	public int getNtoLastValue(int n) {
		Node offset = head;
		Node current = head;
		int count = 0;
		while (count < n) {
			offset = offset.next;
			count++;
		}
		while (offset != null) {
			offset = offset.next;
			current = current.next;
		}
		return current.value;

	}

	/* ovo je pokusaj metode remove duplicates
	 * zasad ne radi
	 * */
	public void removeDuplicates() {
		Node previous = head;
		Node current = head.next;
		Node step = head;

		for (int i = 0; i < size; i++) {
			while (current.next != null) {
				if (current.value == step.value) {
					previous.next = current.next;
					current.next = null;
					return;
				}
				current = current.next;
				previous = previous.next;
			}
			step = step.next;
		}
	}

	/**
	 * Method converts a linked list into a regular array
	 * 
	 * @return array of integers int[]
	 */
	public int[] toArray() {
		int[] tmp = new int[size];
		Node current = head;
		for (int i = 0; i < size; i++) {
			tmp[i] = current.value;
			current = current.next;
		}
		return tmp;
	}

	/**
	 * 
	 * Method checks if the linked list contains certain value.
	 * 
	 * @param value
	 *            Receives a integer as value
	 * @return boolean true or false
	 */
	public boolean contains(int value) {
		Node current = head;

		while (current != null) {
			if (current.value == value) {
				return true;

			}
			current = current.next;
		}
		return false;
	}

	/*
	 * Method throws Index out of Bounds exception with a message Used couple of
	 * times in this class
	 */
	private void throwIOBexception(int idx) {
		throw new IndexOutOfBoundsException("Index " + idx
				+ " outside array interval");
	}

	/**
	 * Method prints out all elements of the list
	 */
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}

	}

	/**
	 * Method converts the list of integers into String
	 */
	public String toString() {
		String str = "[";
		Node current = head;
		while (current != null) {
			str += current.value;
			if (current.next != null)
				str += ", ";
			current = current.next;
		}
		return str += "]";
	}

}// end of class LinkedListInt