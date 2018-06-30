package Gra_w_zgadywanie_liczb;

import java.util.Random;
import java.util.Scanner;

public class ZgadnijLiczbe {
	public static void zgadnijLiczbe() {
		Random RandomNumber = new Random();
		int mysteriousNumber = RandomNumber.nextInt(101);

		System.out.println("Zgadnij liczbę");
		Scanner getNumber = new Scanner(System.in);
		int number;
		int count = 0;
		while (true) {
			while (!getNumber.hasNextInt()) {
				System.out.println("nie jest liczba!");
				getNumber.next();
				System.out.println("Zgadnij liczbę");
			}

			number = getNumber.nextInt();
			// System.out.println(number);

			if (number < mysteriousNumber) {
				System.out.println("Za mało!");
				count++;
			} else if (number > mysteriousNumber) {
				System.out.println("Za dużo!");
				count++;
			} else {
				System.out.println("Zgadłeś!!");
				break;
			}

		}
		System.out.println("Zgadywałeś " + count + " razy");
	}

	public static void main(String[] args) {
		zgadnijLiczbe();

	}

}
