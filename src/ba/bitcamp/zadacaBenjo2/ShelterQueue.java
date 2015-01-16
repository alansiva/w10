package ba.bitcamp.zadacaBenjo2;

public class ShelterQueue {
	private MyQueue cats;
	private MyQueue dogs;

	public ShelterQueue() {
		cats = new MyQueue();
		dogs = new MyQueue();
	}

	public void addAnimaltoShelter(String animal) {
		if (animal.equalsIgnoreCase("cat")) {
			cats.push(animal);
			System.out.println("new cat brought to shelter" + cats.getIndex());
		} else if (animal.equalsIgnoreCase("dog")) {
			dogs.push(animal);
			System.out.println("new dog brought to shelter" + dogs.getIndex());
		} else {
			throw new IllegalArgumentException("Only cat or dog");
		}
	}

	public void pop(String input) {
		if (dogs.isEmpty() && cats.isEmpty()) {
			System.out.println("Empty shelter");
			return;
		}
		if (input.equalsIgnoreCase("cat")) {
			if (cats.isEmpty()) {
				System.out.println("No more cats in shelter");
				return;
			}
			cats.dequeue();
			System.out.println("Cat adopted");
		

		} else if (input.equalsIgnoreCase("dog")) {
			if (dogs.isEmpty()) {
				System.out.println("No more dogs in shelter");
				return;
			}
			dogs.dequeue();
			System.out.println("Dog adopted");
			return;
		} else {

			if (cats.getIndex() < dogs.getIndex() || dogs.isEmpty()) {
				cats.dequeue();
				System.out.println("Cat adopted");
				return;

			} else if (dogs.getIndex() < cats.getIndex() || cats.isEmpty()) {

				dogs.dequeue();
				System.out.println("Dog adopted");
				return;
			}
		}

	}

}
