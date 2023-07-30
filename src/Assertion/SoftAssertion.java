package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	@Test
	public void DemoTest() {
		
		
		SoftAssert soft = new SoftAssert();
	
		System.out.println("Execution started");
		soft.assertEquals("java", "java");
		
		soft.assertEquals(true,true);
		
		System.out.println("Execution completed");
		System.out.println("hello");
		
		soft.assertAll();
		//it collects the result of all assertion and in case if any failure mark the
		//test as failed
	}
	@Test
public void Demo() {
		SoftAssert soft = new SoftAssert();
		
		System.out.println("Execution started Demo");
		soft.assertEquals("java", "java");
		
		soft.assertEquals(true,true);
		
		System.out.println("Execution completed");
		
		
		soft.assertAll();
}
}