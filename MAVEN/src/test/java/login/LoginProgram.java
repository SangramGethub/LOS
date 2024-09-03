package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginProgram {

	public String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Before test exicuted");
		
		
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	}
	    
	@Test
	public void loginTest() 
	{    
		//find usrname and enter username "Admin"
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		
		//find password and enter password "admin123"
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		
		//Login buttonclick
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();  //we can use click() insted of submit()
		
		
		//Verify If the login was successful by checking the page title
		String pageTitle = driver.getTitle();
		
		
		if(pageTitle.equals("OrangeHRM"))
		{
			System.out.println("login successful");
			}
		
		
		else
		{
			System.out.println("Login faild");
			}
	}
		@AfterTest
		public void tearDown1() throws Throwable
		{
			Thread.sleep(5000);
			driver.close();
			
		} 
		
		
	}
	
	
	
