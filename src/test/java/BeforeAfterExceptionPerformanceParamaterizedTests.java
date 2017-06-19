import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterExceptionPerformanceParamaterizedTests {
	
	@Test
	public void arrayTester(){
		int[] arr1={13,6,67,1};
		int[] arr2={1,6,13,67};
		Arrays.sort(arr1);
		assertArrayEquals(arr2,arr1);
	}
	
	@Test(expected=NullPointerException.class)
	public void exceptionsInTesting(){
		int [] arr1=null;
	//  int [] arr1={};
		Arrays.sort(arr1);
	}
	
	@BeforeClass
	public static void beforeAllTests(){
		System.out.println("Just  executed once before running tests! For better performance and memory optimization.");
	}
	
	@Before
	public void beforeEveryTestCode(){
		System.out.println("Before each test!");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1 executed!");
	}
	
	@Test
	public void test2(){
		System.out.println("Test 2 executed!");
	}
	
	@After
	public void breakdown(){
		System.out.println("After each test!");
	}

	@AfterClass
	public static void afterAllTests(){
		System.out.println("Just executed once after all tests! Close all connections!");
	}
}
