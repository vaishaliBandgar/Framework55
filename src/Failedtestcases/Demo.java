package Failedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void Test1() {
		System.out.println("Test1");
		Assert.assertTrue(false);
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
		Assert.assertTrue(true);
	}
	@Test
	public void Test3() {
		System.out.println("Test3");
		Assert.assertTrue(true);
	}



}
