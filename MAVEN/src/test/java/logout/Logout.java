package logout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logout {
	
	public String a = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Before test executed");
		
		driver = new ChromeDriver();
		driver.get(a);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
		
	}
	
	    public void logout()
	    {
	    	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	    	driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
	    }
	    
	    @AfterTest
	    public void tearDown() throws Throwable
	    {
	    	Thread.sleep(5000);
	    	logout();
	    	Thread.sleep(5000);
	    	driver.quit();
	    }
}
