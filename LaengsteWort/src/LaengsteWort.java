import java.util.Scanner;

public class LaengsteWort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein.");
		String satz = scanner.nextLine().toLowerCase();
		scanner.close();
		
		String[] woerter = satz.split(" ");
		
		String laengstesWort = "";
		int maxLaenge = 0;
		
		for(int i = 0; i < woerter.length; i++) {
			if(woerter[i].length() > maxLaenge) {
				laengstesWort = woerter[i];
				maxLaenge = woerter[i].length();
			}
		}
		System.out.printf("Das Längste wort ist '%s' mit %d Zeichen.%n", laengstesWort, maxLaenge);

	}

}
