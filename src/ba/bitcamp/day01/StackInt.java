package ba.bitcamp.day01;

/*
 * Week 10, day 01, lab work
 * Exercise stack
 */

public class StackInt {

	private Node head;

	private class Node {
		public int value;
		Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}

	/**
	 * Method adds a element to the stack
	 * @param value
	 */
	public void push(int value) {

		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;

	}

	/**
	 * Method removes the last added element from the stack 
	 * and returns its value
	 * @return int value of the removed element
	 */
	public int pop() {
		if (head == null){
			throw new IllegalStateException("Stack empty");
		}
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;

		// int value = head.value; //skontat zasto ovo nije moglo??
		// head = head.next;
		// return value;

	}

	public int peek() { 

		return head.value;
	}

	public int getSize() {
		if (head == null) {
			return 0;
		}
		return getSize(head, 0);

	}

	private int getSize(Node current, int counter) {
		if (current == null) {
			return counter;
		}
		return getSize(current.next, counter + 1);
	}

	public boolean contains(int value) {
		if (head.value == value){
			return true;
		}
		return contains(head, value);
	}
	
	private boolean contains(Node current, int value){
		
		if (current == null){
			return false;
		}
		if (current.value == value){
			return true;
		}
		return contains(current.next, value);
		
		
		
		
	}

}
