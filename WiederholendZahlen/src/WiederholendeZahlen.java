import java.util.HashMap;

public class WiederholendeZahlen {

	public static void main(String[] args) {
		
		int[] array = {1, 4, 6, 4, 34, 2, 11, 6, 45, 6, 1, 99, 32, 4, 11};
		
		HashMap<Integer, Integer> wiederholung = new HashMap<>();
		
		//Häufigkeit der Zahlen zählen
		for(int zahl : array) {
			if(wiederholung.containsKey(zahl)) {
				wiederholung.put(zahl, wiederholung.get(zahl) + 1);
			}else {
				wiederholung.put(zahl, 1);
			}
		}
		//Ergebnisse ausgeben
		System.out.println("Wiederholende Zahlen:");
		for(int zahl : wiederholung.keySet()) {
			int haeufigkeit = wiederholung.get(zahl);
			if(haeufigkeit > 1) {
			System.out.println(zahl + " kommen " + haeufigkeit + " vor.");
			}
		}
	}

}
