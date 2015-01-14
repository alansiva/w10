package com.bitcamp.day03;

public class TestCSVBuilder {

	public static void main(String[] args) {

		Adress ad = new Adress("Humska");
		Student st = new Student(86, "Jesenko", ad);
		
		
		System.out.println(st.toCSV());
	}

}
