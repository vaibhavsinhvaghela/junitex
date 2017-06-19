import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_Condition1() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//fail("Not yet implemented");	
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Condition2(){
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicTrueScenario(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicFalseScenario(){
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}

}
