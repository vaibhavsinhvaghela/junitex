import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) // STEP 1 IS THIS ----------------------------- MAKE THE CLASS PARAMETERIZED
public class StringHelperParameterizedTest {
	
	StringHelper helper=new StringHelper();

	private String input;
	private String output;
	
	// STEP 2 ------------------------------- CREATE A PARAMETERIZED CONSTRUCTOR
	public StringHelperParameterizedTest(String input, String output) {
		this.input = input;
		this.output = output;
	}
	
	@Parameters // STEP 3 ------------------------CREATE A PARAMETERIZED METHOD WITH PARAMETERS TO BE TESTED
	public static Collection<String[]> testConditions(){
		String expectedOutputs[][]={ {"AACD", "CD"}, {"AB","B"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void test() {
		assertEquals(output, helper.truncateAInFirst2Positions(input));
	}

}
