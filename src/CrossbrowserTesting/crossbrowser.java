package CrossbrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	

	WebDriver driver;
	@Parameters("Browsername")
	
	@Test
   public void OrangeHRM(String Browsername) { 
		if(Browsername.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	}
//		else if(Browsername.equalsIgnoreCase("IE")) {
//			System.setProperty("webdriver.ie.driver","C:\\Users\\bkban\\Downloads\\IEDriverServer_Win32_4.10.0\\IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
//		}
	else if(Browsername.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\bkban\\Desktop\\msedgedriver.exe");
		 driver = new EdgeDriver();
		}
//		else if(Browsername.equalsIgnoreCase("IE")) {
//			System.setProperty("webdriver.geuko.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe");
//			driver = new InternetExplorerDriver();
//		}
	
	
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement Uname = driver.findElement(By.name("username"));
		Uname.sendKeys("Admin");
		WebElement Pass = driver.findElement(By.name("password"));
    	Pass.sendKeys("admin123");
    	String Exp_Name="JohnNguyenNguyenNguyen";
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    String Act_Name=driver .findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
   Assert.assertEquals( Act_Name, Exp_Name);
   System.out.println("Correct usrname");
   System.out.println("Execution completed");
   driver.quit();
	}
}
	