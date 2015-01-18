package ba.bitcamp.samostalniRad.listLinked;

public class ListTest {
	public static void main(String[] args) {
		List test = new List();
		System.out.println("Empty list: " + test);
		
		test.add(4);
		test.add(6);
		System.out.println("After add: " + test);
		
		test.push(9);
		test.push(3);
		System.out.println("After push: " + test);
		
		test.pop();
		System.out.println("After pop: " + test);
		
		test.insertAt(12, 2);
		System.out.println("After insert: " + test);
		
		test.insertAt(15, 4);
		System.out.println("After insert at end: " + test);
		
		test.removeAt(4);
		test.add(7);
		System.out.println("After remove from end: " + test);
	
		test.add(2);
		System.out.println("After add: " + test);
		System.out.println(test.size());
		
		/*testing homework*/
		System.out.println("\nHOMEWORK\n");
		System.out.println("Removed element: " + test.remove());
		System.out.println("Ater removing last element" + test);
		
		System.out.println(test.size());
		
	}
}