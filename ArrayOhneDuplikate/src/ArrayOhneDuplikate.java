import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayOhneDuplikate {

	public static void main(String[] args) {
		
		int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 1, 3, 5, 5, 6, 7, 9};
		
		HashSet<Integer> set = new HashSet<>();
		//Duplikate entfernen mit einem Set
		for(int zahl : array) {
			//Fügt nur einzigartige Werte hinzu
			set.add(zahl);
		}
		
		//In eine Liste umwandeln und sortieren
		ArrayList<Integer> sortiertesArray = new ArrayList<>(set);
		Collections.sort(sortiertesArray);
		
		//Ergebnis Ausgeben
		System.out.println("Sortiertes Array ohne Duplikate: " + sortiertesArray);

	}

}
