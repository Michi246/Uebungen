import java.util.ArrayList;
import java.util.Arrays;

public class PrimzahlFinden {

	public static void main(String[] args) {
		
		//Liste mit Zahlen
		ArrayList<Integer> zahlen = new ArrayList<>(Arrays.asList(4,3,1,66,54,32,78,90,99,64,8,16,51,22,34));
		ArrayList<Integer> primzahlen = new ArrayList<>();
		
		//Zahlen Filtern
		for(int zahl : zahlen) {
			if(istPrimzahl(zahl)) {
				primzahlen.add(zahl);
			}
		}
		
		//Liste mit Primzahlen ausgeben
		System.out.println("Primzahle: " + primzahlen);
		
	}
	
	//Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
	public static boolean istPrimzahl(int zahl) {
		if(zahl <= 2) {
			//Keine Primzahl
			return false;
		}
		//Schleife bis zur Quadratwurzel
		for(int i = 2; i <= Math.sqrt(zahl); i++) {
			//prüfen ob es teilbar ist
			if(zahl % i == 0) {
				//Keine Primzahl da teilbar
				return false;
			}
		}
		return true;
	}
}
