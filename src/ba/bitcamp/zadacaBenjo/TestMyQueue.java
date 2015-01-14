package ba.bitcamp.zadacaBenjo;

/**
 * Test class for MyQueue
 * @author jesenkogavric
 *
 */

public class TestMyQueue {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
	
		/* testing push method */
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		
		/* testing size method*/
		System.out.println("Size of queue: " + queue.size());

		
		/* testing peek method */
		System.out.println("Peek: " + queue.peek());
	
		
		/* testing pop method */
		System.out.println("Pop: " + queue.pop());
		System.out.println("Pop: " + queue.pop());
		System.out.println("Pop: " + queue.pop());
		System.out.println("Pop: " + queue.pop());
		
		
		System.out.println("Size of queue: " + queue.size());

	}

}
