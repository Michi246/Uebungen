
public class ZweitKleinsteZahl {

	public static void main(String[] args) {

		int[] array = {23, 22, 1, 5, 90, 34, 87, 9, 20, 44};

		//kleinste und zweitKleinste Zahl auf sehr große Werte setzen
		int kleinste = Integer.MAX_VALUE;
		int zweitKleinste = Integer.MAX_VALUE;
		//Array durchlaufen und kleinste und zweitKleinste Zahl finden
		for(int zahl : array) {
			if(zahl < kleinste) {
				//Die bisher kleinste Zahl wird zur zweitKleinsten
				zweitKleinste = kleinste;
				//Aktulisiere die kleinste Zahl
				kleinste = zahl;
			}else if(zahl < zweitKleinste && zahl != kleinste) {
				//Aktualisiere die zweitKleinste Zahl, falls sie kleiner ist
				zweitKleinste = zahl;
			}
		}
		System.out.println("Die zweitkleinste Zahl ist : " + zweitKleinste);
	}

}
