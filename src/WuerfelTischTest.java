import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WuerfelTischTest {

	WuerfelTisch wuerfelTisch;
	Spieler spieler;
	
	@Before
	public void setUp() throws Exception {
		wuerfelTisch  = new WuerfelTisch();
		spieler = new Spieler();
		
		spieler.setName("Tester");
		spieler.setBudget(100);
	}

	@Test
	public void test() {
		
		wuerfelTisch.spielen(spieler);
		assertEquals(spieler.getBudget(), spieler.getBudget(), 0.5);
	}

}
