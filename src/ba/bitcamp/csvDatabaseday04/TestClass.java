package ba.bitcamp.csvDatabaseday04;

public class TestClass {

	public static void main(String[] args) {
	
		
		User neko = new User("Jesenko", "Gavric", 26, true);

		System.out.println(neko.toCSVString(","));
		
		CSVReadWrite.saveToFile("User", neko.toCSVString(","));
		
	

	}

}
