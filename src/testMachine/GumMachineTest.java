package testMachine;
import gumMachine.GumMachine;
import junit.framework.TestCase;

import org.junit.*;

public class GumMachineTest extends TestCase {
	GumMachine myMachine = new GumMachine();
	
	@Test
	public void testTurnWheel(){
		myMachine.setGumballs(2);
		myMachine.turnWheel();
		assertEquals(1,myMachine.getGumballs());
	}	
	
	@Test
	public void testTurnWheel2(){
		myMachine.setGumballs(70);
		myMachine.turnWheel();
		assertTrue(myMachine.getGumballs() == 69);
		myMachine.turnWheel();
		myMachine.turnWheel();
		assertEquals(67,myMachine.getGumballs());		
	}
	
}


