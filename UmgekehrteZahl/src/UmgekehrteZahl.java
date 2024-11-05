import java.util.Scanner;

public class UmgekehrteZahl {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl ein.");
		int zahl = scanner.nextInt();
		scanner.close();
		
		int umgedrehteZahl = 0;
		//Absolutwert verwenden, um das Vorzeichen später zu berücksichtigen
		int rest = Math.abs(zahl);
		
		//Schleife zur Berechnung der umgedrehten Zahl
		while(rest > 0) {
			//Letzte Ziffer extrahieren
			int letzteZiffer = rest % 10;
			//Ziffer zur Umgedrehten Zahl hinzufügen
			umgedrehteZahl = umgedrehteZahl * 10 + letzteZiffer;
			//Letzte Ziffer entfernen
			rest = rest / 10;
		}
		//Wenn die ursprüngliche Zahl negativ war, mach die umgedrehte Zahl ebenfalls negativ
		if(rest < 0) {
			umgedrehteZahl = -umgedrehteZahl;
		}
		//Ausgabe der umgedrehten Zahl
		System.out.println("Die Umgedrehte Zahl ist: " + umgedrehteZahl);
	}

}
