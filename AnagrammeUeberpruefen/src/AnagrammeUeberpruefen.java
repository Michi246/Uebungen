import java.util.Arrays;
import java.util.Scanner;

public class AnagrammeUeberpruefen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String wort1 = null, wort2 = null;
		
		//Eingabe des ersten Wortes
		while(wort1 == null){
			try {
				System.out.println("Bitte geben Sie das erste Wort ein.");
				wort1 = scanner.nextLine().toLowerCase();
			}catch(Exception e) {
				System.out.println("Fehler bei der Eingabe! Bitte versuchen Sie es erneut.");
				wort1 = null;
			}
		}
		//Eingabe des zweiten Wortes
		while(wort2 == null){
			try {
				System.out.println("Bitte geben Sie das zweite Wort ein.");
				wort2 = scanner.nextLine().toLowerCase();
			}catch(Exception e) {
				System.out.println("Fehler bei der Eingabe! Bitte versuchen Sie es erneut.");
				//Zurücksetzen, um erneut abzufragen
				wort2 = null;
			}
		}
		
		//Anagrammprüfung
		if(sindAnagramme(wort1, wort2)) {
			System.out.println("Ja, die Wörter \"" + wort1 + "\" und \"" + wort2 + "\" sind Anagramme.");
		}else {
			System.out.println("Nein, die Wörter \"" + wort1 + "\" und \"" + wort2 + "\" sind keine Anagramme.");
		}
		scanner.close();
	}
	
	//Methode zur Überprüfung, ob zwei Wörter Anagramme sind
	public static boolean sindAnagramme(String wort1, String wort2) {
		if(wort1.length() != wort2.length()) {
			//Unterschiedliche längen können keine Anagramme sein
			return false;
		}
		
		//Buchstaben Sortieren und vergleichen
		char[] wort1Array = wort1.toCharArray();
		char[] wort2Array = wort2.toCharArray();
			
		Arrays.sort(wort1Array);
		Arrays.sort(wort2Array);
		
		return Arrays.equals(wort1Array, wort2Array);
		}
		
	}
