package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super (driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inputmail;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement inputpassword;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btnlogin;
	
	public void setmail(String email)
	{
		inputmail.sendKeys(email);
	}
	public void setpassword(String pwd)
	{
		inputpassword.sendKeys(pwd);
	}
	public void clicklogin()
	{
		btnlogin.click();
	}
	

}
