package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P2 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");	
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	}
	
	@Test
	public  void parameter()
	{
		P1 obj1 = new P1(driver);
		
		obj1. setUN("Admin");
		obj1. setPW("admin123");
		obj1. logB();
         
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@AfterClass
	public void v()
	{
		driver.quit();
	}
	
		
	}
