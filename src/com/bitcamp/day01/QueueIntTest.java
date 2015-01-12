package com.bitcamp.day01;

/*
 * Test class for QueueInt
 */

public class QueueIntTest {

	public static void main(String[] args) {
		
		QueueInt sta = new QueueInt();

		/* testing 'push' method' */

		sta.push(5);
		sta.push(7);
		sta.push(9);
		sta.push(3);

		System.out.println("Peek" + sta.peek());
		
		System.out.println("Size of stack: " + sta.getSize());
		
		/* testing 'pop' method 
		 * when stack gets empty, method throws 
		 * illegal state exception with message "Empty stack"*/
		
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());



	}

}
