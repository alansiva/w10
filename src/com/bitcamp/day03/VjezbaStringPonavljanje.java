package com.bitcamp.day03;

/*
 * Ponavljanje starog gradiva
 * kratka vjezba
 */

public class VjezbaStringPonavljanje {

	public static void main(String[] args) {

		/* sabiranje stringova */
		String str = "";

		for (int i = 0; i < 100; i++) {

			str += i + ",";

		}
		System.out.println("SABIRANJE STRINGOVA");
		System.out.println(str);

		/* concat */
		String str2 = "";

		for (int i = 0; i < 100; i++) {

			str2 = str2.concat(String.valueOf(i)).concat(",");

		}
		System.out.println("\nCONCAT");
		System.out.println(str2);

		/* stringbuilder */
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 100; i++) {

			sb.append(i).append(",");

		}
		System.out.println("\nSTRING BUILDER");
		System.out.println(sb.toString());
	
	}

}
