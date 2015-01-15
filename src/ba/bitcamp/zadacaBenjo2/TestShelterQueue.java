package ba.bitcamp.zadacaBenjo2;

public class TestShelterQueue {
	public static void main(String[] args) {
		
		ShelterQueue shell = new ShelterQueue();
		System.out.println(shell.pop("cat"));
				
		shell.addAnimaltoShelter("cat");
		shell.addAnimaltoShelter("cat");
		shell.addAnimaltoShelter("dog");
		shell.addAnimaltoShelter("dog");
			
		System.out.println(shell.pop("dog"));
		
		System.out.println(shell.pop(""));
		
	}
}
