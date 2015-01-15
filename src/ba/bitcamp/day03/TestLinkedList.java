package ba.bitcamp.day03;

public class TestLinkedList {

	public static void main(String[] args) {
	
		LinkedList<String> names = new LinkedList<String>();
		names.add("ime");
		names.add("neko");
		names.add("davor");
		names.add("emir");
		names.add("emina");
		names.add("mirza");
		names.add("edib");
		names.add("amra");
		
		names.printList();
		
		names.remove(5);
		
		System.out.println("\nAfter remove: \n");
		names.printList();
		
		System.out.println("\nGet at: \n" + names.getAt(1));
		
		if (names.contains("davor")){
			System.out.println("Contains...");
		}

	}

}
