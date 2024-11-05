import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZeichenHaeufigkeit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein.");
		String satz = scanner.nextLine().toLowerCase();
		scanner.close();
		
		Map<Character, Integer> haeufigkeit = new HashMap<>();
		
		for(char c : satz.toCharArray()) {
			if(haeufigkeit.containsKey(c)) {
				haeufigkeit.put(c, haeufigkeit.get(c) + 1);
			}else {
				haeufigkeit.put(c, 1);
			}
		}
		System.out.println("Häufigkeit der Zeichen:");
		for(Map.Entry<Character, Integer> eintrag : haeufigkeit.entrySet()) {
			System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
		}
	}

}
