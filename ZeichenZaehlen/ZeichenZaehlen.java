import java.util.Scanner;

public class ZeichenZaehlen {

    public static void main(String[] args) {
        // Eingabe vom Benutzer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie lautet ihr Wort oder ihr Satz?");
        String eingabe = scanner.nextLine();
        scanner.close();

        eingabe = eingabe.toUpperCase();
        // Array für die Häufigkeiten von Zeichen
        int[] buchstaben = new int[265];
        // Schleife über jedes Zeichen im String
        for (int i = 0; i < eingabe.length(); i++) {
            // Aktuelles Zeichen
            char c = eingabe.charAt(i);
            // Erhöht den Zähler für das Zeichen im Array
            buchstaben[c]++;
        }
        // Ausgabe der Häufigkeiten
        for (int i = 0; i < buchstaben.length; i++) {
            // Nur Zeichen mit einer Häufigeit > 0 anzeigen
            if (buchstaben[i] > 0) {
                System.out.println((char) i + ", " + buchstaben[i]);
            }
        }
    }
}