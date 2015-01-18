package ba.bitcamp.samostalniRad.phoneBook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* PhoneBooke exercise */
/**
 * Class implements a HashMap of Persons and their phone numbers.
 * @author jesenkogavric
 *
 */

public class PhoneBook {

	private static HashMap<String, Person> phoneBook;
	private static Set<String> contacts;

	/* constructor for PhoneBook */
	public PhoneBook() {
		phoneBook = new HashMap<String, Person>();
		contacts = phoneBook.keySet();
	}

	/**
	 * Adds a contact to the PhoneBook (hashMap)
	 * @param name of the contact (String)
	 * @param phone number (int)
	 */
	public void addContact(String name, int number) {
		
		phoneBook.put(name, new Person(name, number));
	}

	/**
	 * Ads a number to a existing key (person) of the phone book (hashMap)
	 * @param name of the person (key)
	 * @param phone number to add (int)
	 */
	public void addNumber(String name, int num) {
	
		phoneBook.get(name).addNumber(num);		
	}

	/**
	 * Removes an existing person (key) of the phone book (hashMap)
	 * @param name of the person (String)
	 */
	public void removeContact(String name) {
		
		phoneBook.remove(name);
	}

	/**
	 * Removes a number that a person contains
	 * @param name of the person
	 * @param index of the number in the list
	 */
	public void removeNumber(String name, int idx) {
		
		phoneBook.get(name).removeNumber(idx);
	}

	/**
	 * Prints names and numbers of the phone book (hashMap) 
	 */
	public void printPhonebook() {
		Iterator<String> contactsIterator = contacts.iterator();

		while (contactsIterator.hasNext()) {		
			
			String contact = contactsIterator.next();
			Iterator<Integer> numberIterator = phoneBook.get(contact).getNumbers().iterator();
			System.out.println("Name: " + contact);

			while (numberIterator.hasNext()) {		
				System.out.print("\tPhone number: " + numberIterator.next() + "\n");
			}
			System.out.println();
		}
	}

	/**
	 * Print's one person and its numbers from the phonebook
	 * @param name of the person to print
	 */
	public void contactInfo(String name) {
		
		System.out.println(phoneBook.get(name));
	}

	/**
	 * Print's out the list of persons (keys) in the phone book (hasMap)
	 */
	public void listContact() {
		Iterator<String> contactsIterator = contacts.iterator();

		while (contactsIterator.hasNext()) {
			String contact = contactsIterator.next();
			System.out.println("Name: " + contact);

		}
	}

}//end of class PhoneBook
