package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Firstprogram {
	
	WebDriver driver;

	@Test(dataProvider ="Logindata")
	public void Logintest(String Uname,String PWD) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement Username1 = driver.findElement(By.name("username"));
		Username1.sendKeys("Uname");
		WebElement Pass = driver.findElement(By.name("password"));
    	Pass.sendKeys("PWD");
    	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	
    //	String Exp_Name="Test babbang";
    
   // boolean Test=driver .findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).isDisplayed();
   //Assert.assertTrue(Test);
   
   driver.quit();
   }
	
	@DataProvider(name ="Logindata")
	public Object[][] LoginData(){
		Object data[] [] = new Object[5][2];
		data[0][0]="Admin";
		data[0][1]="admin123";  //correct UN PW
		
		data[1][0]="Admin";
		data[1][1]="admin1234";  //correct UN InPW
		
		data[2][0]="Admin";
		data[2][1]="admin123";  //INcorrect UN cPW
		
		
		data[3][0]="Admin";
		data[3][1]="admin1233";  //IN UN PW
		
		data[4][0]="";
		data[0][1]="admin123";  //Empty UN cPW
		
		return data;
		
		
		
	}
	
}