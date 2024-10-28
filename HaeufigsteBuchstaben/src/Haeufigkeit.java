import java.util.Scanner;

public class Haeufigkeit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein.");
		String satz = scanner.nextLine().toLowerCase();
		scanner.close();
		
		//Array für die Häufigkeit der Buchstaben
		int[] haeufigkeit = new int[26];
		
		//Buchstabenhäufigkeit speichern
		for(char c : satz.toCharArray()) {
			//Nur Buchstaben Zählen
			if(Character.isLetter(c)) {
				//Berechnet den Index des Buchstabens
				int index = c - 'a';
				//Erhöht die Häufigkeit
				haeufigkeit[index]++;
			}
		}
		//Häufigsten Buchstaben finden
		int maxHaeufigkeit = 0;
		char haeufigsterBuchstabe = ' ';
		for(int i = 0; i < haeufigkeit.length; i++) {
			if(haeufigkeit[i] > maxHaeufigkeit) {
				maxHaeufigkeit = haeufigkeit[i];
				//Berechnet den Buchstaben
				haeufigsterBuchstabe = (char)(i + 'a');
			}
		}
		System.out.printf("Der häufigste Buchstabe ist '%c' mit %d Vorkommen.%n", haeufigsterBuchstabe, maxHaeufigkeit);
	}

}
