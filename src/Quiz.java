import java.lang.Math;
import java.util.Scanner;
/*Napi�i komentar */
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

	public static void Mno�enje() {

	}

	public static void Djeljenje() {

	}

	public static void Kvadriranje() {
		int broj = Random();
		System.out.println("Koliki je kvadrat broja " + broj);
		int odgovor = input.nextInt();
		int rje�enje = (int)Math.pow(broj, 2);
		if (odgovor == rje�enje) {
			System.out.println("Ta�an odgovor!");
		}
		else {
			System.out.println("Pogre�an odgovor.");
		}
	}

	public static void Korjenovanje() {

	}
}
