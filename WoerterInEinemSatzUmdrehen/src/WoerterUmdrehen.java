import java.util.Scanner;

public class WoerterUmdrehen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte giben Sie einen Satz ein");
		String eingabe = scanner.nextLine();
		scanner.close();
		
		String[] woerter = eingabe.split(" ");
		StringBuilder umgedrehterSatz = new StringBuilder();
		for(String wort : woerter) {
			String einzelneWoerter = new StringBuilder(wort).reverse().toString();
			umgedrehterSatz.append(einzelneWoerter).append(" ");
		}
		
		
		System.out.println("Umgedrehter Satz: " + umgedrehterSatz.toString().trim());
	}
}
