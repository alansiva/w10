package ba.bitcamp.balansiranjeZagrada;

/*
 * Class used for brackets order test exercise
 * @author jesenkogavric
 *
 */

public class BracketStack {

	private Node first;

	public class Node {
		private char value;
		Node next;

		public Node(char sign) {
			this.value = sign;
			next = null;
		}
	}// end of class Node

	/**
	 * Adds a new element to the stack
	 * 
	 * @param char as parameter
	 */
	public void push(char c) {
		Node newNode = new Node(c);
		newNode.next = first;
		first = newNode;

	}

	/**
	 * Removes the last added element from the stack
	 */
	public void pop() {
		if (first == null) {
			throw new IllegalStateException("Stack empty");
		}
		first = first.next;
	}

	/**
	 * 
	 * @return the last element value of the stack
	 */
	public char peek() {
		return first.value;
	}

	/**
	 * Checks if the stack is empty
	 * 
	 * @return true or false
	 */
	public boolean isEmpty() {
		return (first == null);

	}

}// end of class BracketStack
