import java.util.Scanner;

public class SummeZiffern {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zhl ein.");
		int zahl = scanner.nextInt();
		scanner.close();
		
		int summe = 0;
		
		//Schleife zur Berechnung der Ziffernsumme
		while(zahl > 0) {
			//Letzte Ziffer extrahieren
			int ziffer = zahl % 10;
			//Zur Summe hinzufügen
			summe += ziffer;
			//Letzte Ziffer entfernen
			zahl = zahl / 10;
		}
		System.out.println("Die Summe der Zahl ist: " + summe);
	}

}
