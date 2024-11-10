import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WoerterZaehlen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen satz ein.");
		String satz = scanner.nextLine().toLowerCase();
		scanner.close();
		
		String[] woerter = satz.split(" ");
		int haeufigkeit = 0;
		
		HashMap<String, Integer> wortHaeufigkeit = new HashMap<>();
		
		//Wörter durchlaufen und Häufigeit zählen
		for(String wort : woerter) {
			if(wortHaeufigkeit.containsKey(wort)){
				//Wenn das Wort bereits vorhanden ist, Häufigkeit erhöhen
				wortHaeufigkeit.put(wort, wortHaeufigkeit.get(wort) + 1);
			}else {
				//Wenn das Wort nicht vorhanden ist, neu Hinzufügen mit Häufigkeit 1
				wortHaeufigkeit.put(wort, 1);
			}
		}
		//Ergebnis Ausgeben
		System.out.println("Häufigkeit der Wörter:");
		for(Map.Entry<String, Integer> eintrag : wortHaeufigkeit.entrySet()) {
			System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
		}
		
		

	}

}
