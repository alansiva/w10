package ba.bitcamp.samostalniRad.zadacaBenjo;

/*
 * Test class for LinkedList
 */

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(5);
		list.add(9);
		list.add(3);
		list.add(11);
		list.add(7);
		list.add(3);
		list.add(21);

		list.printList();

		/* testing getMiddleValue() method */
		System.out.println("Middle of the list: " + list.getMiddleValue());
		
		/* testing getNtoLastValue() method */
		System.out.println("4th. value from end: " + list.getNtoLastValue(4));
		

		list.printList();
		
		list.removeDuplicates();
		
		list.printList();



	}
}
