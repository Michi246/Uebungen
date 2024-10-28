
public class DurchschnittAbweichungen {

	public static void main(String[] args) {
		
		int[] array = {2, 5, 8, 10, 15, 43, 2, 22, 6, 11};
		
		//Durchschnitt berechnen
		int summe = 0;
		for(int i = 0; i < array.length; i++) {
			//Summe der Zahlen im Array berechnen
			summe += array[i];
		}
		double durchschnitt = (double)summe / array.length;
		System.out.println();
		//Ausgaben des Durchschnitts
		System.out.println("Durchschnitt: " + durchschnitt);
		
		//Abweichungen berechnen und ausgeben
		System.out.println("Abweichungen vom Durchschnitt:");
		for(int i = 0; i < array.length; i++) {
			double abweichung = array[i] - durchschnitt;
			System.out.printf("%d:\t %+,.2f%n", array[i], abweichung);
		}
	}
}
