package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1 {
	
	@FindBy(name="username")WebElement username;
	@FindBy(name="password")WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement loginButton;
	
	public P1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUN(String un)
	{
		username.sendKeys(un);
	}

	 public void setPW(String pw)
	 {
      	password.sendKeys(pw);
      }
	
	 public void logB()
	 {
		 loginButton.click();
	 }
}
