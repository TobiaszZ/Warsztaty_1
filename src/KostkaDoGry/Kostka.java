package KostkaDoGry;

import java.util.Random;
import java.util.Scanner;

public class Kostka {

	public static int dice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Rzuć kostką");
		String diceThrow = scan.nextLine();
		scan.close();

		// cużyć metody cantains + lub contains -
		String[] splitBySign = new String[2];
		String splitBySign1 = splitBySign[0];
		String splitBySign2 = splitBySign[1];
		if (diceThrow.contains("+")) {
			
		}

		if (diceThrow.charAt(3) == '+') {
			splitBySign = diceThrow.split("\\+");
			splitBySign1 = splitBySign[0];
			splitBySign2 = splitBySign[1];
		} else if (diceThrow.charAt(3) == '-') {
			splitBySign = diceThrow.split("-");
			splitBySign1 = splitBySign[0];
			splitBySign2 = splitBySign[1];
		} else {
			splitBySign1 = diceThrow;
			splitBySign2 = "";
		}
		String[] splitByD = new String[2];
		splitByD = splitBySign1.split("D");
		String splitByD1 = splitByD[0];
		String splitByD2 = splitByD[1];

		int x = Integer.parseInt(splitByD1);
		int z = Integer.parseInt(splitBySign2);
		int r = Integer.parseInt(splitByD2);

		Random diceType = new Random();
		int y = diceType.nextInt(r) + 1;

		int result = 0;
		if (diceThrow.charAt(3) == '+') {
			result = x * y + z;
		} else if (diceThrow.charAt(3) == '-') {
			result = x * y - z;
		} else {
			result = x * y;
		}

		return result;

	}

	public static void main(String[] args) {
		int result;
		try {
			result = dice();
			System.out.println("Wynik rzutu: " + result);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("dadsdasf");
		}
		

	}

}
/*
 * Kod takiej kostki wygląda następująco: xDy+z gdzie: y – rodzaj kostek,
 * których należy użyć (np. D6, D10), x – liczba rzutów kośćmi (jeśli rzucamy
 * raz, ten parametr jest pomijalny), z – (opcjonalnie) liczba, którą należy
 * dodać (lub odjąć) do wyniku rzutów.
 */