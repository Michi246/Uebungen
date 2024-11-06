import java.util.Scanner;

public class LaengstePalindrom {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein.");
		String satz = scanner.nextLine();
		scanner.close();
		
		String[] woerter = satz.split(" ");
		String laengstesPalindrom = "";
		
		for(String wort : woerter) {
			if(istPalindrom(wort) && wort.length() > laengstesPalindrom.length()) {
				laengstesPalindrom = wort;
			}
		}
		if(!laengstesPalindrom.isEmpty()) {
			System.out.println("Das längste Palindro ist \"" + laengstesPalindrom + "\" mit " + laengstesPalindrom.length() + " zeichen.");
		}else {
			System.out.println("Es gibt kein Palindrom.");
		}
	}
	public static boolean istPalindrom(String wort) {
		int left = 0;
		int right = wort.length() - 1;
		
		while(left < right) {
			if(wort.charAt(left) != wort.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		
		return true;
	}
}
