import java.util.HashMap;

public class WuerfelAutomat {
		
	public final double EINSATZ = 0.5;
	
	public void spielen(Person spieler) {
		if(spieler.getBudget() >= EINSATZ) {
			spieler.setBudget(spieler.getBudget() - EINSATZ);
			spieler.setBudget(spieler.getBudget() + this.wuerfeln(EINSATZ));
		} else {
			System.out.println("Nicht genügend Geld zum Spielen vorhanden!");
		}
	} 
		
	private HashMap<Integer, Integer> pruefeZahlenvorkommen(int durchlaeufe) {
		HashMap<Integer, Integer> zahlenhaeufigkeit = new HashMap<Integer, Integer>();
		
		for (int i=0; i<durchlaeufe; i++) {
			int wuerfelErgebnis = CasinoHelper.zufallszahl(2, 12);
			
			if(zahlenhaeufigkeit.containsKey(wuerfelErgebnis)) {
				zahlenhaeufigkeit.put(wuerfelErgebnis, zahlenhaeufigkeit.get(wuerfelErgebnis) + 1);
			} else {
				zahlenhaeufigkeit.put(wuerfelErgebnis, 1);
			}
		}
		
		return zahlenhaeufigkeit;
	}
	
	private double wuerfeln(double einsatz) {
		int wuerfelErgebnis = CasinoHelper.zufallszahl(2,12);
		
		switch(wuerfelErgebnis) {
			case 12: return einsatz * 4;
			case 11: return einsatz * 3;
			case 10: return einsatz * 2;
			case 9: return einsatz;
			case 8: return einsatz;
			case 7: return einsatz;
			case 6: return 0;
			default: return 0;
		}	
	}
	
}
