package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver;
	
	@BeforeMethod
public void setup() { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	public void OrangeHRM() {
		
		WebElement Uname = driver.findElement(By.name("username"));
		
		WebElement Pass = driver.findElement(By.name("password"));
//		
//		//Assert true
//		Assert.assertTrue(Uname.isDisplayed());
//		Uname.sendKeys("Admin");
//	Assert.assertTrue(Pass.isDisplayed());
//		Pass.sendKeys("admin123");
//	
//		
		//Assert false
//		
//		Assert.assertFalse(Uname.isDisplayed());
//		Uname.sendKeys("Admin");
//		Assert.assertFalse(Pass.isDisplayed());
//		Pass.sendKeys("admin");
//		
	boolean Test = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
	//Assert.assertEquals(Test, true);
	Assert.assertEquals(Test, false);
	System.out.println("Execution completed");
		
	}
	@AfterMethod 
	public void Teardown() {
		driver.quit();
	}

}
