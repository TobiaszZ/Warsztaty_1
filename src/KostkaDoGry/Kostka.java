package KostkaDoGry;

import java.util.Random;
import java.util.Scanner;

public class Kostka {

	public static int dice() throws NumberFormatException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Rzuć kostką");
		String diceThrow = scan.nextLine();
		scan.close();
		String diceThrowUp = diceThrow.toUpperCase();
		// cużyć metody cantains + lub contains -
		String[] splitBySign = new String[2];
		String splitBySign1 = splitBySign[0];
		String splitBySign2 = splitBySign[1];
		int x;
		int z;
		int r;
		int y;
		int result = 0;
		if (diceThrow.contains("+")) {
			splitBySign = diceThrowUp.split("\\+");
			splitBySign1 = splitBySign[0];
			splitBySign2 = splitBySign[1];
			char firstChar = splitBySign1.charAt(0);

			if (Character.isDigit(firstChar)) {
				String[] splitByD = new String[2];
				splitByD = splitBySign1.split("D");
				String splitByD1 = splitByD[0];
				String splitByD2 = splitByD[1];

				x = Integer.parseInt(splitByD1);
				z = Integer.parseInt(splitBySign2);
				r = Integer.parseInt(splitByD2);

				Random diceType = new Random();
				y = diceType.nextInt(r) + 1;

				result = x * y + z;
			} else {
				String[] splitByD = new String[2];
				splitByD = splitBySign1.split("D");
				String splitByD1 = splitByD[0];
				String splitByD2 = splitByD[1];
				z = Integer.parseInt(splitBySign2);
				r = Integer.parseInt(splitByD2);
				Random diceType = new Random();
				y = diceType.nextInt(r) + 1;

				result = y + z;

			}
			String[] splitByD = new String[2];
			splitByD = splitBySign1.split("D");
			String splitByD1 = splitByD[0];
			String splitByD2 = splitByD[1];

			x = Integer.parseInt(splitByD1);
			z = Integer.parseInt(splitBySign2);
			r = Integer.parseInt(splitByD2);

			Random diceType = new Random();
			y = diceType.nextInt(r) + 1;

			result = x * y + z;
		} else if (diceThrowUp.contains("-")) {
			splitBySign = diceThrow.split("-");
			splitBySign1 = splitBySign[0];
			splitBySign2 = splitBySign[1];
			char firstChar = splitBySign1.charAt(0);

			if (Character.isDigit(firstChar)) {
				String[] splitByD = new String[2];
				splitByD = splitBySign1.split("D");
				String splitByD1 = splitByD[0];
				String splitByD2 = splitByD[1];

				x = Integer.parseInt(splitByD1);
				z = Integer.parseInt(splitBySign2);
				r = Integer.parseInt(splitByD2);

				Random diceType = new Random();
				y = diceType.nextInt(r) + 1;

				result = x * y - z;
			} else {
				String[] splitByD = new String[2];
				splitByD = splitBySign1.split("D");
				String splitByD1 = splitByD[0];
				String splitByD2 = splitByD[1];
				z = Integer.parseInt(splitBySign2);
				r = Integer.parseInt(splitByD2);
				Random diceType = new Random();
				y = diceType.nextInt(r) + 1;

				result = y - z;
			}

		} else {
			char firstChar = diceThrow.charAt(0);
			if (Character.isDigit(firstChar)) {
				splitBySign1 = diceThrow;
				// splitBySign2 = "";

				String[] splitByD = new String[2];
				splitByD = splitBySign1.split("D");
				String splitByD1 = splitByD[0];
				String splitByD2 = splitByD[1];

				x = Integer.parseInt(splitByD1);

				r = Integer.parseInt(splitByD2);

				Random diceType = new Random();
				y = diceType.nextInt(r) + 1;

				result = x * y;
			} else {
				String letters = "";
				for (int i = 1; i < diceThrow.length(); i++) {
					char letter = diceThrow.charAt(i);
					String letterToString = Character.toString(letter);
					letters = letters.concat(letterToString);

				}

				r = Integer.parseInt(letters);

				Random diceType = new Random();
				y = diceType.nextInt(r) + 1;
				result = y;
			}

		}

		return result;

	}

	public static void main(String[] args) {
		int result;
		try {
			result = dice();
			System.out.println("Wynik rzutu: " + result);
		} catch (NumberFormatException e) {
			System.err.println("Niepoprawny kod kostki!");
		}

	}

}
/*
 * Kod takiej kostki wygląda następująco: xDy+z gdzie: y – rodzaj kostek,
 * których należy użyć (np. D6, D10), x – liczba rzutów kośćmi (jeśli rzucamy
 * raz, ten parametr jest pomijalny), z – (opcjonalnie) liczba, którą należy
 * dodać (lub odjąć) do wyniku rzutów.
 */