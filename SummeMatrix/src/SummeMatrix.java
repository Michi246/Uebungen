
public class SummeMatrix {

	public static void main(String[] args) {

		int[][] matrix = {
				{1, 3, 5},
				{2, 4, 6},
				{7, 9, 12}
		};

		int summe = 0;
		//Durchläuft die Matrix und berechnet sie
		for(int i = 0; i < matrix.length; i++) {
			//Matrix[i] für die Spalten
			for(int j = 0; j < matrix[i].length; j++) {
				//Addiert das Element zur Summe
				summe += matrix[i][j];
			}
		}
		//Ausgabe der Matrix
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		//Ausgabe der Summe
		System.out.println("Die Summe der Matrix ist: " + summe);
	}

}
