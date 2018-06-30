package Gra_w_zgadywanie_liczb2;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanie_liczb {
	public static void zgadywanie() {
		System.out.println("Podaj liczbę do zgadnięcia od 1 do 1000:");
		Scanner scanInput = new Scanner(System.in);
		while (!scanInput.hasNextInt()) {
			System.out.println("To nie jest liczba!");
			scanInput.next();
			System.out.println("Podaj liczbę");
		}
		int number = scanInput.nextInt();
		if (!(number >= 1 && number <= 1000)) {
			System.err.println("Błąd zakresu");
			return;
		}
		int min = 0;
		int max = 1000;

		while (true) {
			int randomGuess = ((max - min) / 2) + min;
			System.out.println("Czy " + randomGuess + " to Twoja liczba?");
			String reply = scanInput.next();
			if (reply.equals("mniej")) {
				
				max = randomGuess;
				// System.out.println("Za dużo!");
			} else if (reply.equals("więcej")) {
				
				min = randomGuess;
				// System.out.println("Za mało!");
			} else if (randomGuess == number) {
				System.out.println("super!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		zgadywanie();
		// komendy
		// więcej mniej zgadłeś
		// if w ifie
	}

}
