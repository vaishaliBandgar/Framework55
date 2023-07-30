package BYjus;




	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

//	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Counceling2 {

		WebDriver driver;		
		@BeforeMethod
	     public void Get() {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkban\\Desktop\\chromedriver.exe");	
	//	WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();

	    driver.get("https://byjus.com/btc/ ");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		@Test
		public void login() throws InterruptedException {
			
				
			driver.findElement(By.xpath("//button[@class=\"counselling-btn\"]")).click();
			
			driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("vaishali");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9970017221");
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//button[@class=\"otp-btn\"]")).click();	
			Thread.sleep(3000);
			
			WebElement formcity = driver.findElement(By.xpath("//select[@id=\"formCity\"]"));
			Select SC = new Select(formcity);
			SC.selectByValue("Nagpur");
			Thread.sleep(2000);
			
			WebElement center = driver.findElement(By.xpath("//select[@id=\"formCenter\"]"));
			Select SC1 = new Select(center);
			SC1.selectByVisibleText("Nagpur-Kasturchand Park");
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//input[@id=\"class-ten\"]")).click();	
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();	
			Thread.sleep(5000);
			}
		@AfterMethod
		public void TearDown() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
		
	}



