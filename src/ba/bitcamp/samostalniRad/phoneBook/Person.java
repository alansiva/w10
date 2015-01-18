package ba.bitcamp.samostalniRad.phoneBook;

import java.util.LinkedList;

/* PhoneBooke exercise */
/**
 * Class implements an Person as object. Person is a object used for PhoneBook
 * class. Person contains a name, and a linked list of phone numbers (Integers)
 * 
 * @author jesenkogavric
 *
 */

public class Person {

	private int maxNumbersPerPerson = 3;
	private String name;
	private LinkedList<Integer> numbers = new LinkedList<Integer>();

	/* constructor for Person */
	public Person(String name, int number) {
		this.name = name;
		this.numbers.add(number);
	}

	/**
	 * Ads a number to the 'Person' containing list Maximum 3 numbers.
	 * (practical purposes)
	 * 
	 * @param phone
	 *            number
	 */
	public void addNumber(int number) {
		if (numbers.size() == maxNumbersPerPerson) {
			throw new IllegalStateException("Max 3 numbers per person");
		}
		this.numbers.add(number);
	}

	/**
	 * Removes a phone number from a specified index in the list
	 * 
	 * @param idx
	 */
	public void removeNumber(int idx) {
		if (idx < 0 || idx > maxNumbersPerPerson) {
			throw new IllegalStateException("Invalid index: " + idx
					+ ". Valid choice is: 0, 1 and 2");
		}
		numbers.remove(idx);
	}

	/**
	 * @return list of numbers that the object Person contains
	 */
	public LinkedList<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * Override toString method. Returns name and phone numbers as String
	 */
	@Override
	public String toString() {
		return "Contact: " + name + " Numbers: " + "[" + numbers + "]";
	}

}// end of class Person