package TestNGFeatures;

import org.testng.annotations.Test;

public class day3 {
	@Test
	public void Test1() {
		System.out.println("Hello");
	}
	@Test(groups = {"smoke"})
	public void Test4() {
		System.out.println("Day3---Test4");
	}


}
