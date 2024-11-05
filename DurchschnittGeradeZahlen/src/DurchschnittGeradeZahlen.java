
public class DurchschnittGeradeZahlen {

	public static void main(String[] args) {
		
		int[] array = {2, 21, 5, 44, 97, 8, 12, 99, 51, 77};
		
		int summe = 0;
		int anzahlGeradeZahlen = 0;
		
		for(int i = 0; i < array.length; i++) {
			//Prüfen, ob das Element gerade ist
			if(array[i] % 2 == 0) {
				//Summe der geraden Zahlen berechnen
				summe += array[i];
				//Anzahl der geraden Zahlen erhöhen
				anzahlGeradeZahlen++;
			}
		}
		//Falls es gerade Zahlen gibt
		if(anzahlGeradeZahlen > 0) {
			double durchschnitt = (double)summe / anzahlGeradeZahlen;
			System.out.println("Der Durchschnitt der geraden Zahlen ist: " + durchschnitt);
		}else {
			System.out.println("Es gibt keine geraden Zahlen.");
		}		
	}

}
