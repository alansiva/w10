package com.bitcamp.day02;

/**
 * Test class for MyTreeOfString
 */

public class TestMyTreeOfString {

	public static void main(String[] args) {
		

		MyTreeOfString tree = new MyTreeOfString();
		
		/*Testing add method*/
		
		tree.addData("Vedo");
		tree.addData("Emir");
		tree.addData("Mirza");
		tree.addData("Amra");
		
		
		/* Testing print methods */
		
		tree.preOrderPrint(); 
		
		System.out.println();
		
		tree.postOrderPrint();
		
		System.out.println();
		
		tree.inOrderPrint();

	}

}
