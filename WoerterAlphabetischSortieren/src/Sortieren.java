import java.util.Arrays;
import java.util.Scanner;

public class Sortieren {

	public static void main(String[] args) {
		
		//Eingabe vom Benutzer einlesen
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein.");
		String eingabe = scanner.nextLine();
		scanner.close();
		
		//Eingabe in Kleinbuchstaben umwandeln und in Wörter aufteilen
		eingabe = eingabe.toLowerCase();
		String[] woerter = eingabe.split(" ");
		
		//Wörter Alphabetisch sortieren
		Arrays.sort(woerter);
		
		//Sortierte Wörter ausgeben
		System.out.println("Sortierte Wörter:");
		for(String wort : woerter) {
			System.out.print(wort + " ");
			
		}
		

	}

}
