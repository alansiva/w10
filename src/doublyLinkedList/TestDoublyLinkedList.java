package doublyLinkedList;

/*
 * Test class for DoublyLinkedList
 */

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(8);//0
		list.add(3);//1
		list.add(2);//2
		list.add(5);//3 
		
		System.out.println("Size of the list: " + list.size());
		System.out.println(list.toString());
		
		list.remove(2);	
		System.out.println("Size after remove: " + list.size());
		
		System.out.println(list.toString());

	}

}
