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
		} else if (animal.equalsIgnoreCase("dog")) {
			dogs.push(animal);
		} else {
			throw new IllegalArgumentException("Only cats and dogs please.");
		}
	}

	public String pop(String input) {
		if (dogs.isEmpty() && cats.isEmpty()) {
			return "No animals in shelter";
		}

		if (input.equalsIgnoreCase("cat")) {
			if (cats.isEmpty()) {
				return "No More cats";
			}
			String temp = cats.peek();
			cats.pop();
			return temp;

		} else if (input.equalsIgnoreCase("dog")) {
			if (dogs.isEmpty()) {
				return "No more dogs";
			}
			String temp = dogs.peek();
			dogs.pop();
			return temp;
		} else {

			if (cats.getIndexX() < dogs.getIndexX() || dogs.isEmpty()) {
				String temp = cats.peek();
				cats.pop();
				return temp;
			} else if (cats.getIndexX() > dogs.getIndexX() || cats.isEmpty()) {
				String temp = dogs.peek();
				dogs.pop();
				return temp;
			}
		}
		return "";
	}
}
