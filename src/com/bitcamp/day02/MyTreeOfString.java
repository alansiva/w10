package com.bitcamp.day02;

/**
 * week10, day 02, lab work
 * MyTreeOfString Class implements binary tree data structure of Strings.
 * Methods: add, print
 * 
 * @author jesenkogavric
 * 
 */

public class MyTreeOfString {

	/* attributes */
	private String data; // value stored
	private MyTreeOfString left; // reference to the left node in the structure
	private MyTreeOfString right; // reference to the right node in the
									// structure

	/* default constructor for MyTreeOfString */
	public MyTreeOfString() {
		data = null;
		left = null;
		right = null;
	}

	/* constructor for MyTreeOfString */
	public MyTreeOfString(String data) {

		this.data = data;
		left = null;
		right = null;

	}

	/* getters */
	public String getData() {
		return data;
	}

	public MyTreeOfString getLeft() {
		return left;
	}

	public MyTreeOfString getRight() {
		return right;
	}

	/**
	 * Method adds a new element to the data structure.
	 * 
	 * @param data
	 *            to add
	 */
	public void addData(String data) {

		/*
		 * If data (current node) is null, the value is added to the current
		 * node
		 */
		if (this.data == null) {
			this.data = data;
			return;
		}
		/*
		 * If the value of the certain data is less of the current node data
		 * value, it's going to be sorted to the left of the current node
		 */

		if (this.data.compareToIgnoreCase(data) < 0) {
			if (left == null) {
				left = new MyTreeOfString(data);
			} else {
				left.addData(data);
			}
		}
		/*
		 * If it's value is equal or grater then the current node value,it is
		 * going to be sorted on the right
		 */
		else {
			if (right == null) {
				right = new MyTreeOfString(data);
			} else {
				right.addData(data);
			}
		}
	}

	/**
	 * Print method
	 */
	public void preOrderPrint() {

		System.out.println(data);
		if (left != null) {
			left.preOrderPrint();
		}
		if (right != null) {
			right.preOrderPrint();
		}
	}

	/**
	 * Print method
	 */
	public void postOrderPrint() {

		if (left != null) {
			left.postOrderPrint();
		}
		if (right != null) {
			right.postOrderPrint();
		}
		System.out.println(data);
	}

	/**
	 * Print method
	 */
	public void inOrderPrint() {

		if (left != null) {
			left.inOrderPrint();
		}
		System.out.println(data);
		if (right != null) {
			right.inOrderPrint();
		}
	}

}
