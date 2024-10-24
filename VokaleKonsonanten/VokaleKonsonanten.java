import java.util.Scanner;

public class VokaleKonsonanten {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Satz ein.");
        String eingabe = scanner.nextLine();
        scanner.close();

        int vokale = 0;
        int konsonanten = 0;

        eingabe = eingabe.toLowerCase();

        for(int i = 0; i < eingabe.length(); i++){
            char zeichen = eingabe.charAt(i);

            if(Character.isLetter(zeichen)){
                if(zeichen == 'a'|| zeichen == 'e'|| zeichen == 'i'|| zeichen == 'o'|| zeichen == 'u'){
                    vokale++;
                }else{
                    konsonanten++;
                }

            }
        }
        System.out.println("Vokale:\t\t" + vokale + "\nKonsonanten:\t" + konsonanten);
    }
}
