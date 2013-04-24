
public class CasinoStart {

	public static void main(String[] args) {
		// Instanziierungen
		WuerfelAutomat wuerfelAutomat = new WuerfelAutomat();
		WuerfelTisch wuerfelTisch = new WuerfelTisch();
		
		Spieler spieler1 = new Spieler("Paul", 20.0);
		Spieler spieler2 = new Spieler("Helmut", 100.0);
		Spieler spieler3 = new Spieler("Anna", 50.0);
		
		// Spielsimulation Paul
		for (int i=0; i<10; i++) {
			wuerfelAutomat.spielen(spieler1);	
		}
		System.out.printf("%s hat nach dem Spiel %.2f EUR.\n", spieler1.getName(), spieler1.getBudget());

		// Spielsimulation Helmut
		for (int i=0; i<10; i++) {
			wuerfelTisch.spielen(spieler2);	
		}
		System.out.printf("%s hat nach dem Spiel %.2f EUR.\n", spieler2.getName(), spieler2.getBudget());
		
		// Spielsimulation Anna
		for (int i=0; i<5; i++) {
			wuerfelAutomat.spielen(spieler3);
			wuerfelTisch.spielen(spieler3);
			
		}
		System.out.printf("%s hat nach dem Spiel %.2f EUR.\n", spieler3.getName(), spieler3.getBudget());
	}
	
}
