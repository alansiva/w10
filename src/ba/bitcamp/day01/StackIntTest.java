package ba.bitcamp.day01;

/*
 * Test class for StackInt
 */

public class StackIntTest {

	public static void main(String[] args) {

		StackInt sta = new StackInt();

		/* testing 'push' method' */

		sta.push(5);
		sta.push(7);
		sta.push(9);
		sta.push(3);

		/* testing 'contains' method */
		
		if (sta.contains(9)) {
			System.out.println("Contains");
		} else
			System.out.println("No");

		/* testing getSize method */

		System.out.println("Size of stack: " + sta.getSize());
		
		System.out.println("Peek" + sta.peek());
		

		/* testing 'pop' method 
		 * when stack gets empty, method throws 
		 * illegal state exception with message "Empty stack"*/
		
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());

//		System.out.println(sta.pop());  
		
		System.out.println();

	}

}
