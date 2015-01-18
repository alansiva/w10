package ba.bitcamp.day04;

public class CSVReadWrite {

	private static String basePath = "./Database/";

	public static boolean saveToFile(String fileName, String data) {

		try {
			TextIO.writeFile(basePath + fileName + ".csv");
			TextIO.putln(data);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
