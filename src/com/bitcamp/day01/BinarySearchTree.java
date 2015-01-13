package com.bitcamp.day01;

/*
 * week 10 day 02 lab work
 * Binary Search Tree exercise
 * jesenkogavric
 */

public class BinarySearchTree {

	private Node root;

	/* constructor for BinarySearchTree */
	public BinarySearchTree() {
		root = null;
	}

	private class Node {
		public int value;
		Node left;
		Node right;

		/* constructor for Node */
		public Node(int value) {
			this.value = value;
		}

	}// end of class Node

	/**
	 * Method adds a new value to the binary tree.
	 * If the root is null, it adds the value to root, 
	 * else it sends the value and the root as parameters to a private 
	 * recursive add method.
	 * @param value that's going to be added
	 */
	public void add(int value) {
		if (root == null) {
			root = new Node(value);
		} else
			add(root, value);
	}

	/*
	 * Private recursive method that is called by the public add method.
	 * @param the root of the binary tree that is sent from the public method
	 * @param value that is going to be added, also sent from the public method
	 */
	private void add(Node current, int value) {

		if (current == null) {
			current = new Node(value);
			return;
		}// ovaj if ne moze ovako raditi

		if (value <= current.value) {
			if (current.left == null) {
				current.left = new Node(value);
				return;

			}
			add(current.left, value);
		} else {
			if (current.right == null) {
				current.right = new Node(value);
				return;
			}
			add(current.right, value);
		}
	}

	/**
	 * Method prints the elements of the Binary tree
	 */
	public void printTree() {
		printTree(root);
	}
	/*recursive method of the printTree method*/
	public void printTree(Node root) {
		if (root == null) {
			return;
		}
		printTree(root.left);
		System.out.println(root.value);
		printTree(root.right);
	}

}// end of class BinarySearchTree
