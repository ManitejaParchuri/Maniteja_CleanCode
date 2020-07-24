package cleancode;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseDefTest {
    HouseDef t=new HouseDef();
    
	@Test
	public void testCost() {
		assertEquals(250000.0,t.cost("high standard material" , 100, "fully automated home"),0);
		
	}

}
