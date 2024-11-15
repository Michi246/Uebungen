import java.util.HashMap;
import java.util.Scanner;

public class EinzigartigeZeichen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein.");
		String satz = scanner.nextLine().toLowerCase();
		scanner.close();
		HashMap<Character, Integer> haeufigkeit = new HashMap<>();
		
		for(char c : satz.toCharArray()) {
			if(c != ' ') {
				haeufigkeit.put(c, haeufigkeit.getOrDefault(c, 0) + 1);	
			}
		}
		System.out.println("Einzigartige Zeichen: ");
		for(char c : satz.toCharArray()) {
			if(c != ' ' && haeufigkeit.get(c) == 1) {
				System.out.print(c + " ");
			}
		}
		
	}

}
