package ba.bitcamp.samostalniRad.doublyLinkedList;


/**
 * Class implements a double linked list
 * 
 * @author Jesenko unfinished
 */

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	public class Node {
		private Node next;
		private Node previous;
		private int value;

		/* constructor */
		public Node(int value) {
			this.value = value;
			next = null;
			previous = null;
		}
	}// end of class Node

	/**
	 * Method adds a new element to the end of the list
	 * 
	 * @param value
	 *            to add
	 */
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.previous = current;
			tail = newNode;

			size++;
		}
	}

	/**
	 * Remove an element from a certain index of the list
	 * 
	 * @param index
	 *            of the element which is going to be removed
	 */
	public void remove(int index) {
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
	 * @return size of the list
	 */
	public int size() {
		return size;
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

}// end of cass DoublyLinkedList
