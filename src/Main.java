import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int odabir = -1;
		while(true) {
			System.out.println("Odaberi oblast:");
			System.out.println("1.Sabiranje");
			System.out.println("2.Oduzimanje");
			System.out.println("3.Množenje");
			System.out.println("4.Dijeljenje");
			System.out.println("5.Kvadriranje");
			System.out.println("6.Korjenovanje");
			System.out.println("0.Izlaz");
			odabir = in.nextInt();
			switch (odabir) {
			case 0 : in.close(); System.exit(0); break;
			case 1 : Quiz.sabiranje(); break;
			case 2 : Quiz.oduzimanje(); break;
			case 3 : Quiz.Mnozenje(); break;
			case 4 : Quiz.Djeljenje(); break;
			case 5 : Quiz.Kvadriranje(); break;
			case 6 : Quiz.Korjenovanje(); break;
			default : System.out.println("Pogresan unos!"); break;
			}
		}
	}

}
