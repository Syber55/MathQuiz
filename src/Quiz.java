import java.lang.Math;
import java.util.Scanner;
/*Napiši komentar */
/*Preporuèujem korištenje Scannera input */
public class Quiz {
	public static final Scanner input = new Scanner (System.in);
	public static int Random() {
		int broj = (int) (Math.random() * 10);
		return broj;
	}

	public static void Sabiranje() {

	}

	public static void Oduzimanje() {

	}

	public static void Množenje() {

	}

	public static void Djeljenje() {

	}

	public static void Kvadriranje() {
		int broj = Random();
		System.out.println("Koliki je kvadrat broja " + broj);
		int odgovor = input.nextInt();
		int rješenje = (int)Math.pow(broj, 2);
		if (odgovor == rješenje) {
			System.out.println("Tacan odgovor!");
		}
		else {
			System.out.println("Pogresan odgovor.");
		}
	}

	public static void Korjenovanje() {
		int rješenje = Random();
		int broj = (int) (Math.pow(rješenje, 2));
		System.out.println("Koliki je korijen broja " + broj);
		int odgovor = input.nextInt();
		if (odgovor == rješenje) {
			System.out.println("Tacan odgovor!");
		}
		else {
			System.out.println("Pogresan odgovor.");
		}
	}
}
