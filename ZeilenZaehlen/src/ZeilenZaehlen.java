import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZeilenZaehlen {

    public static void main(String[] args) {
        String dateiPfad = "beispiel.txt";  // Der Name der Datei
        int zeilenZaehler = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(dateiPfad))) {
            String zeile;
            while ((zeile = reader.readLine()) != null) {  // Solange Zeilen vorhanden sind
                zeilenZaehler++;
                System.out.println("Zeile " + zeilenZaehler + ": " + zeile);  // Ausgabe jeder Zeile
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }

        // Ausgabe der Gesamtanzahl der Zeilen
        System.out.println("Anzahl der Zeilen: " + zeilenZaehler);
    }
}
