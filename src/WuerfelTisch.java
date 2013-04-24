
public class WuerfelTisch {
	
	public final double EINSATZ = 1.0;
	
	public void spielen(Person spieler) {
		if(spieler.getBudget() >= EINSATZ) {
			spieler.setBudget(spieler.getBudget() - EINSATZ);
			spieler.setBudget(spieler.getBudget() + this.wuerfeln(EINSATZ));
		} else {
			System.out.println("Nicht genügend Geld zum Spielen vorhanden!");
		}
	} 
		
	private double wuerfeln(double einsatz) {
		int vergleich = 0;
		
		for(int i=0; i<3; i++) {
			int wuerfelErgebnis = CasinoHelper.zufallszahl(1,6);
			
			if(vergleich == 0) {
				vergleich = wuerfelErgebnis;
			} else {
				if(vergleich != wuerfelErgebnis) {
					return 0;
				}
			}
		}
		
		return einsatz * 5;
	}
	
}
