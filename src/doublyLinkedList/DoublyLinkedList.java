package doublyLinkedList;

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
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Index out of range");

		if (index == 0) {
			head = head.next;
			size--;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int i = 1;
		while (i < index) {
			if (current.next == null) {
				System.out.println("test");
				previous.next = null;
				current = null;
				size--;
			}
			current = current.next;
			previous = previous.next;
			i++;
		}
		i++;
		Node newNode = current.next;
		previous.next = newNode;
		if (i != size)
			newNode.previous = previous;
		current = null;
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
