package BYjus;



import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Byjus2 {
	
	WebDriver driver;
	@BeforeMethod
public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkban\\Desktop\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");
	}
	@Test
	public void Byjus() throws InterruptedException {
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		WebElement name=driver.findElement(By.xpath("//h2[normalize-space()='Watch video lessons']"));
		
		JS.executeScript("arguments[0].scrollIntoView();",name);
		
		Thread.sleep(3000);
		
		WebElement b1=driver.findElement(By.xpath("//select[@class=\"form-control video-selection\"]"));
		
		Select S1=new Select(b1);
		
		S1.selectByVisibleText("Class 7");
		
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//div[@class='row row-inline']//div[1]//a[1]")).click();
		
		Thread.sleep(3000);
	}
		
		@AfterMethod
		
		public void Teardown() {
			
			driver.quit();
		}
}




