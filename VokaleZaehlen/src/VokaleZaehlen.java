import java.util.Scanner;

public class VokaleZaehlen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein.");
		String satz = scanner.nextLine().toLowerCase();
		scanner.close();
		
		int anzahlA = 0;
		int anzahlE = 0;
		int anzahlI = 0;
		int anzahlO = 0;
		int anzahlU = 0;
		int gesamtVokale = 0;
		
		
		for(char c : satz.toCharArray()) {
			switch(c) {
			case 'a':
				anzahlA++;
				gesamtVokale++;
				break;
			case 'e':
				anzahlE++;
				gesamtVokale++;
				break;
			case 'i':
				anzahlI++;
				gesamtVokale++;
				break;
			case 'o':
				anzahlO++;
				gesamtVokale++;
				break;
			case 'u':
				anzahlU++;
				gesamtVokale++;
				break;
			}
		}
		System.out.println("Gesamtanzahl der Vokale: " + gesamtVokale);
		System.out.println("Anzahl von 'a': " + anzahlA);
		System.out.println("Anzahl von 'e': " + anzahlE);
		System.out.println("Anzahl von 'i': " + anzahlI);
		System.out.println("Anzahl von 'o': " + anzahlO);
		System.out.println("Anzahl von 'u': " + anzahlU);
	}

}
