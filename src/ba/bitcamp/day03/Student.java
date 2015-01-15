package ba.bitcamp.day03;

public class Student {

	private int id;
	String name;
	Adress adress;

	public Student(int id, String name, Adress adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;

	}

	public String toCSV(){
		CSVBuilder csv = new CSVBuilder();
		csv.append(id).append(name).append(adress);
		return csv.toString();
	}

}
