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
		
		System.out.println(list.toString());
		System.out.println("Size of the list: " + list.size());
		
		list.remove(3);	
		System.out.println(list.toString());
		System.out.println("Size after remove: " + list.size());
		
		
		
		list.add(88);//4
		System.out.println(list.toString());
		System.out.println("Size after las add: " + list.size());
		

	}

}
