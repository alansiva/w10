package com.bitcamp.day01;

/*
 * Week 10, day 01, lab work
 * Exercise Queue
 * @author jesenkogavric
 */

public class QueueInt {

	private Node head;
	private Node tail;

	private class Node {
		public int value;
		Node next;

		/* Constructor for Node */
		public Node(int value) {
			this.value = value;

		}
	}// end of class Node

	/**
	 * Method adds a element at the end of the queue or in the first place in
	 * case the queue is empty
	 * 
	 * @param value of the element
	 */
	public void push(int value) {

		if (head == null) {
			head = new Node(value);
			tail = head;
			return;
		}
		Node newNode = new Node(value);
		tail.next = newNode;
		tail = tail.next;

	}

	/**
	 * Method 'pops' the first element of the list, and returns its value.
	 * 
	 * @return Value of the popped element
	 */
	public int pop() {

		if (head == null) {
			throw new IllegalStateException("Stack empty");
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

	/**
	 * @return the size of the queue (number of elements)
	 */
	private int getSize(Node current, int counter) {
		if (current == null) {
			return counter;
		}
		return getSize(current.next, counter + 1);
	}

	/**
	 * Method checks if there is a certain value in the queue
	 * 
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
	private boolean contains(Node current, int value) {

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
	 * 
	 * @return true or false
	 */
	public boolean isEmpty() {
		return (head == null);

	}
}// end of class QueueInt
