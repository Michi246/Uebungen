
public class ZweitGroessteZahl {

	public static void main(String[] args) {
		
		int[] array = {2, 45, 56, 78, 79, 81, 60, 21, 45, 25};
		
		int groessteZahl = Integer.MIN_VALUE;
		int zweitGroessteZahl = Integer.MIN_VALUE;
		
		for(int zahl : array) {
			if(zahl > zweitGroessteZahl) {
				//Die bisher größte Zahl wird zur zweitgrößten Zahl
				zweitGroessteZahl = groessteZahl;
				//Aktualisiere die größte Zahl
				groessteZahl = zahl;
			}else if(zahl > zweitGroessteZahl && zahl != groessteZahl) {
				//Aktualisiere die zweitgrößte Zahl
				zweitGroessteZahl = zahl;
			}
			
		}

		System.out.println("Die größte Zahl ist: " + groessteZahl);
		System.out.println("Die zweitgrößte Z ist: " + zweitGroessteZahl);
	}

}
