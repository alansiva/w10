package ba.bitcamp.day02;

/*
 * Test class for BinarySearchTree
 */

public class TestBinarySearchTree {

	public static void main(String[] args) {
	
		BinarySearchTree tree = new BinarySearchTree();
	
		/* testing the add() method from the BinarySearchTree class */
		
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(3);
		tree.add(4);
		
		/* testing the printTree() method from the BinarySearchTree class */
		
		tree.printTree();
		
		/* testing the contains() method*/
		
		if (tree.contains(7)){
			System.out.println("Yes");
		}
	}

}
