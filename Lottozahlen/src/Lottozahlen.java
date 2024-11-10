import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottozahlen {

	public static void main(String[] args) {
		
		ArrayList<Integer> lottoZahlen = new ArrayList<>();
		Random random = new Random();
		
		while(lottoZahlen.size() < 6) {
			int zahl = random.nextInt(49) + 1;
			
			if(!lottoZahlen.contains(zahl)) {
				lottoZahlen.add(zahl);
			}
		}
		Collections.sort(lottoZahlen);
		System.out.println("Die Lottozahlen sind: " + lottoZahlen);
	}

}
