package ba.bitcamp.samostalniRad.phoneBook;

/* PhoneBooke exercise */
/**
 * PhoneBook main class
 * @author jesenkogavric
 *
 */

public class TestPhoneBook {

	public static void main(String[] args) {

		PhoneBook contacts = new PhoneBook(); // creating new empty phone book

		/* initial contact list*/
		contacts.addContact("Gordan", 886732);
		contacts.addContact("Mirza", 258671);
		contacts.addContact("Amra", 856216);
		contacts.addContact("Davor", 778943);

		System.out.println("SAMSUNG Galaxy S3\nMenu"); // just kidding 
		System.out.println("Press 1. to enter Contacts:\n      0. to EXIT");
		int choice = TextIO.getInt();
		
		if (choice == 1) {
			
			do {
					System.out.println("Contacts options: \n"
							+ "	1. add contact:\n"
							+ "	2. remove contact:\n"
							+ "	3. add number to existing:\n"
							+ "	4. contacts list\n"
							+ "	5. EXIT\n");
		

					int choice2 = TextIO.getInt();				
					if (choice2 == 1){									// adding a contact			
						System.out.println("Enter name: ");
						String name = TextIO.getWord();
						System.out.println("Enter number ");
						int number = TextIO.getlnInt();
						contacts.addContact(name, number);
				
					}
					else if (choice2 == 2){								// removing a contact
						System.out.println("Remove contact: \n\n Select by name:  ");
						contacts.listContact();
						String remove = TextIO.getWord();
						contacts.removeContact(remove);

					}
					else if (choice2 == 3){								// adding a number to existing contact
						System.out.println("Select contact by name:\n");
						contacts.listContact();
						String cont = TextIO.getWord();
						contacts.contactInfo(cont);
						System.out.println("Enter new number: ");
						int newNum = TextIO.getInt();
						contacts.addNumber(cont, newNum);
						
					}
					else if (choice2 == 4){								// printing the contact list
						System.out.println("Contacts:\n");
						contacts.printPhonebook();
						
					}
					else if (choice2 == 5){								// exiting the contact option menu and breaking the infinite loop
						System.out.println("Good Bye");
						return;
						
					}
					
			} while (true); // infinite loop

		}else {
		System.out.println("Good Bye");
		return;
		}
		
	}//end of main method

}//end of class Test

