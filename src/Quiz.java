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

	public static void sabiranje() {
		int n1 = Random();
		int n2 = Random();
		System.out.println("Koliko je " + n1 + " + " + n2 + " ?");
		int odgovor = input.nextInt();
		System.out.println("Vas odgovor je " + ((odgovor == n1 + n2) ? "tacan" : "netacan"));

	}
	
	public static void oduzimanje() {
		int n1 = Random();
		int n2 = Random();
		System.out.println("Koliko je " + n1 + " - " + n2 + " ?");
		int odgovor = input.nextInt();
		System.out.println("Vas odgovor je " + ((odgovor == n1 - n2) ? "tacan" : "netacan"));

	}

	public static void Množenje() {
		// generisati dva nasumicna, jednocifrena, cijela broja
		int broj1 = Random();
		int broj2 = Random();

		// pitati korisnika da unese rezultat mnozenja
		System.out.println("Koliko je " + broj1 + " * " + broj2 + "?: ");
		
		// dodijeliti korisnikov unos varijabli
		int odgovor = input.nextInt();

		// provjeriti da li je odgovor tacan, ispisati rezultate korisniku
		if (odgovor == broj1 * broj2) {
			System.out.println("Cestitamo, odgovoro je tacan.");
		} else {
			System.out.println("Odgovor koji ste unijeli nije tacan. " + "Tacan odgovor je " + (broj1 * broj2));
		}

	}

	public static void Djeljenje() {
		// generisati dva nasumicna, jednocifrena, cijela broja
		int kolicnik = Random();
		int djelilac = Random();
		int djeljenik = kolicnik * djelilac;

		// pitati korisnika da unese rezultat mnozenja
		System.out.println("Koliko je " + djeljenik  + " : " + djelilac + "?: ");

		// dodijeliti korisnikov unos varijabli
		int odgovor = input.nextInt();

		// provjeriti da li je odgovor tacan, ispisati rezultate korisniku
		if (odgovor == kolicnik) {
			System.out.println("Cestitamo, odgovoro je tacan.");
		} else {
			System.out.println("Odgovor koji ste unijeli nije tacan. " + "Tacan odgovor je " + kolicnik);
		}
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
