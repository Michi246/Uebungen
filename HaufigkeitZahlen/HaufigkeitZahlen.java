import java.util.Random;
import java.util.Arrays;  // Für die korrekte Ausgabe des Arrays

public class HaufigkeitZahlen {

    public static void main(String[] args) {
        
        Random random = new Random();

        // Array zur Speicherung der Häufigkeit für Zahlen von 0 bis 9
        int[] haeufigkeit = new int[10];

        // Generiere 100 zufällige Zahlen zwischen 0 und 9 und zähle ihre Häufigkeit
        for (int i = 0; i < 100; i++) {
            int zufallsZahl = random.nextInt(10);  // Zufallszahl zwischen 0 und 9
            haeufigkeit[zufallsZahl]++;  // Zähle die Häufigkeit der Zahl
        }

        // Ausgabe der Häufigkeit der Zahlen
        System.out.println("Häufigkeit der Zahlen von 0 bis 9:");
        System.out.println(Arrays.toString(haeufigkeit));
    }
}