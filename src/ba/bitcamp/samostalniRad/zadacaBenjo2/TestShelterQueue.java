package ba.bitcamp.samostalniRad.zadacaBenjo2;

public class TestShelterQueue {
	public static void main(String[] args) {

		ShelterQueue shell = new ShelterQueue();
		shell.pop("cat");

		shell.addAnimaltoShelter("cat");
		shell.addAnimaltoShelter("cat");
		shell.addAnimaltoShelter("cat");
		shell.addAnimaltoShelter("dog");
		shell.addAnimaltoShelter("dog");
		shell.addAnimaltoShelter("dog");
		shell.addAnimaltoShelter("dog");
			
		shell.pop("cat");
		shell.pop("cat");
		
		shell.pop("dog");
		
		shell.pop("");


	

	}
}
