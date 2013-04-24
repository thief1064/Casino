import java.util.Random;

public class CasinoHelper {
	
	static Random zufall = new Random();

	public static int zufallszahl(int min, int max) {
		return zufall.nextInt(max + 1 - min) + min;
	}
	
}
