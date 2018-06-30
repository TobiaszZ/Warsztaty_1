package Losowanie_LOTTO;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Losowanie_LOTTO {
	public static void lotto() {
		int[] myNumbers = new int[6];
		Scanner scanMynumbers = new Scanner(System.in);

		for (int i = 0; i < myNumbers.length; i++) {
			System.out.println("podaj liczbę:");
			myNumbers[i] = scanMynumbers.nextInt();
		}
		Arrays.sort(myNumbers);
		String printMyNumbers = Arrays.toString(myNumbers);
		System.out.println(printMyNumbers);

		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		// System.out.println(Arrays.toString(arr));
		Collections.shuffle(Arrays.asList(arr));
		// System.out.println(Arrays.toString(arr));
		int[] wylosowane = new int[] { arr[0], arr[1], arr[2], arr[3], arr[4], arr[5] };

		System.out.println(Arrays.toString(wylosowane));
		int count = 0;
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < wylosowane.length; j++) {
				if (myNumbers[i] == wylosowane[j]) {
					count++;
				}
			}
		}
		if (count == 3) {
			System.out.println("Trafiłeś trójkę!");
		} else if (count == 4) {
			System.out.println("Trafiłeś czwórkę!");
		} else if (count == 5) {
			System.out.println("Trafiłeś piątkę!");
		} else if (count == 6) {
			System.out.println("Trafiłeś szóstkę!");
		} else {
			System.out.println("Nic nie trafiłeś :(");
		}

	}

	public static void main(String[] args) {
		lotto();

	}

}
