package com.bitcamp.day01;


/*
 * Week 10, day 01, lab work
 * Exercise Queue
 */

public class QueueInt {

	private Node head;
	private Node tail;

	private class Node {
		public int value;
		Node next;

		public Node(int value) {
			this.value = value;

		}
	}

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
		if (head.value == value) {
			return true;
		}
		return contains(head, value);
	}

	private boolean contains(Node current, int value) {

		if (current == null) {
			return false;
		}
		if (current.value == value) {
			return true;
		}
		return contains(current.next, value);

	}
}
