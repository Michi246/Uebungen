import java.util.HashMap;
import java.util.Scanner;

public class WoerterHaufigkeitZaehlen {

    public static void main(String[] args) {
        
        //Eingabe vom Benutzer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Satz ein:");
        String satz = scanner.nextLine();
        scanner.close();

        //Map zur Speicherung der Häufigkeit der Wörter
        HashMap<String, Integer> haeufigkeit = new HashMap<>();

        //Satz in einzelne Wörter aufteilen und in kleinbuchstaben umwandeln
        String[] woerter = satz.toLowerCase().split(" ");

        //Häufigkeit der Wörter zählen
        for(String wort : woerter){
            if(haeufigkeit.containsKey(wort)){
                //Falls das Wort bereits vorhanden ist, erhöhe die Häufigkeit um 1
                haeufigkeit.put(wort, haeufigkeit.get(wort) + 1);
            }else{
                //Falls das Wort noch nicht vorhanden ist, setze die Häufigkeit auf 1
                haeufigkeit.put(wort, 1);
            }
        }
        //Ausgabe der Häufigkeit der Wörter
        for(String wort : haeufigkeit.keySet()){
            System.out.println(wort + ": " + haeufigkeit.get(wort) + " mal");
    }
}
}
