package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void Demo() {
		System.out.println("Hello GM");
		Assert.assertTrue(true);
		System.out.println("Hello");
		Assert.assertEquals("Automation", "Automation");
		System.out.println("Execution completed");
	}
	@Test
	public void DemoTest() {
		
		Assert.assertTrue(true);
		System.out.println("Hello good morning");
		Assert.assertEquals("java", "python");
		System.out.println("Execution completed");
	}
	@Test
public void DemoTest1() {
		
		Assert.assertTrue(true);
		System.out.println("Hello good morning");
		Assert.assertEquals("java", "java");
		System.out.println("Execution completed");
	}
	
}
