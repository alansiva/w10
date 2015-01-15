package ba.bitcamp.balansiranjeZagrada;

/*
 * Klasa implementira provjeru rasporeda zagrada u izrazu koristeci 
 * klasu TokenStack 
 * @author jesenkogavric
 *
 */

public class Brackets {

	public static BracketStack brackets;

	public static void main(String[] args) {

		brackets = new BracketStack(); // stack u koji pushamo otvorene zagrade
										
		String str = "{[()]}";

		/* ispis provjere zagrada */
		
		if (checkBrackets(str)) {
			System.out.println("Brackets in fine oder");
		} else
			System.out.println("Illegal bracket order");

		/* ispis provjere zagrada koristeci prvobitni nacin provjere */
		
		if (checkBracketsBySymmetry(str)) {
			System.out.println("Brackets symetry is ok");
		} else
			System.out.println("Illegal bracket order");

	}

	/* nacin koji vise odgovara postavci zadatka */
	/**
	 * Metoda prima string i pretvara ga u niz charova. Zatim prolazi kroz niz i
	 * ukoliko je zagrada otvorena, gura je na stack, ukoliko je zatvorena onda
	 * iz stacka pop-a zadnji element. Ukoliko je na kraju stack prazan to znaci
	 * da su zagrade dobro rasporedjene, u suprotnom se prekida algoritam.
	 * 
	 * @param String
	 *            koji sadrzi zagrade
	 * @return true ili false
	 */
	public static boolean checkBrackets(String str) {

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
				brackets.push(arr[i]);
			}
			if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
				brackets.pop();
			}
		}
		if (brackets.isEmpty()) {
			return true;
		}

		return false;
	}

	/*
	 * prvobitni nacin na koji sam uradio Ova metoda pretvara String u niz
	 * charova i dok prolazi kroz niz, puni stack tim charovima te poziva metodu
	 * symmetric i provjerava da li je trenutni char u nizu simetrican sa peek()
	 * charom iz stacka. Ukoliko jesu simetricni znaci da je raspored zagrada
	 * pravilan i vraca true.
	 */
	public static boolean checkBracketsBySymmetry(String str) {

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
				brackets.push(arr[i]);
			}
			if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
				if (symmetric(brackets.peek(), arr[i])) {
					return true;
				}
				return false;
			}
		}

		return false;
	}

	/* metod koja provjerava simetriju zagrada */
	public static boolean symmetric(char a, char b) {
		if (a == '(' && b == ')' || a == '[' && b == ']' || a == '{'
				&& b == '}') {
			return true;
		}
		return false;
	}

}//end of class Brackets
