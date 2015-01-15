package ba.bitcamp.day03;

import java.util.Iterator;

/*
 * week 10 day 03 lab work
 * Class implements a generic linked list
 *
 */

public class LinkedList<T> implements Iterable<T> {

	private Node head;

	private class Node<T> {

		T value;
		Node next;

		public Node(T value) {
			this.value = value;
			next = null;
		}
	}// end of class Node

	public void add(T value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;

		}
		current.next = newNode;

	}

	public void remove(int idx) {
		if (idx == 0) {
			head = head.next;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int i = 1;
		while (i < idx) {
			current = current.next;
			previous = previous.next;
			i++;
		}
		previous.next = current.next;
		current.next = null;
	}

	public void printList() {
		Node current = head;
		while (current.next != null) {
			System.out.println(current.value.toString());
			current = current.next;
		}
	}

	public boolean contains(T value) {
		Node<T> current = head;
		while (current.next != null) {
			if (head.value.equals(value)) {
				System.out.println("teest");
				return true;
			}
		}
		current = current.next;
		return false;
	}

	public T getAt(int idx) {// ne valja jos uvijek
		Node<T> current = head;
		int i = 1;
		while (i < idx) {
			current = current.next;
			i++;
		}
		return (T) current.value;
	}

	@Override
	public Iterator<T> iterator() {
		return new Biterator<T>(head);
	}

	public class Biterator<T> implements Iterator<T> {
		private Node<T> current;

		public Biterator(Node start) {
			current = start;
		}

		@Override
		public boolean hasNext() {
			return current.next != null;
		}
		@Override
		public T next() {
			T value = current.value;
			current = current.next;
			return value;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}

}// end of class LinkedList
