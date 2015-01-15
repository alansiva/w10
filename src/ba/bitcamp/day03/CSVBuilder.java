package ba.bitcamp.day03;

public class CSVBuilder {

	private String res = null;

	public CSVBuilder append(String val) {

		if (res != null) {
			res += "," + val;
		} else
			res = val;
		return this;
	}

	public CSVBuilder append(Object obj) {

		return append(obj.toString());
	}

	public CSVBuilder append(Adress val) {

		return append(val.toString());
	}

	public String toString() {
		if (res != null) {
			return res;
		} else
			return "";
	}

}
