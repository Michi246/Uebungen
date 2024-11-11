
public class SaetzeUmkehren {

	public static void main(String[] args) {
		
		String[] saetze = {
			"Das ist ein beispiel Satz.",
			"Java ist cool.",
			"Das Wetter ist nicht so gut"
		};
		
	
		for(int i = 0; i < saetze.length; i++) {
			//Satz in Wörter aufteilen
			String[] woerter = saetze[i].split(" ");
			
			//Wörter umkehren
			StringBuilder umgekehrteSaetze = new StringBuilder();
			for(int j = woerter.length - 1; j >= 0; j--) {
				umgekehrteSaetze.append(woerter[j]);
				
				//Leerzeichen hinzufügen, außer beim letzten Wort
				if(j != 0) {
					umgekehrteSaetze.append(" ");
				}
			}
			//Den umgekehrten Satz im Array speichern
			saetze[i] = umgekehrteSaetze.toString();
		}
		//Ausgabe der umekehrten Sätze
		System.out.println("Die umgekehrten Sätze: ");
		for(String satz : saetze) {
			System.out.println(satz);
		}
	}

}
