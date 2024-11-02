	import java.util.Scanner;

public class PrimzahlenFinden {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Obergrenze ein:");
        int obergrenze = scanner.nextInt();
        scanner.close();
        
        System.out.println("Die Primzahlen bis " + obergrenze + " sind:");
        for (int i = 2; i <= obergrenze; i++) {
            if (istPrimzahl(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
    public static boolean istPrimzahl(int n) {
        if (n < 2) {
            return false;  // Zahlen kleiner als 2 sind keine Primzahlen
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {  // Bis zur Quadratwurzel von n prüfen
            if (n % i == 0) {
                return false;  // Wenn n durch i teilbar ist, ist es keine Primzahl
            }
        }
        return true;  // Wenn keine Teilung gefunden wurde, ist n eine Primzahl
    }
}
