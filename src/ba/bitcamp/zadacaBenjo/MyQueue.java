package ba.bitcamp.zadacaBenjo;

/**
 * Class implements Queue data structure using java stack class.
 * @author jesenkogavric
 */

import java.util.Stack;

public class MyQueue {

	private Stack<Integer> first  = new Stack<Integer>();
	private Stack<Integer> second = new Stack<Integer>();

	/**
	 * Method adds a new element to queue
	 * @param value to add
	 */
	public void push(int value) {
		first.add(value);
	}

	/**
	 * Method removes the first added element from the queue by 'FIFO'(first in first out) order,
	 * and returns its value.
	 * @return value of the removed element
	 */
	public int pop() {
		second.push(first.pop());

		return second.pop();
	}
	/**
	 * 
	 * @return size of the queue
	 */
	public int size(){
		return first.size();
	}
	
	/**
	 * 
	 * @return first element in the queue
	 */
	public int peek(){
		return first.peek();
	}

}
